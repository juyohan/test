package com.example.Schedule.ScheduleController;

import com.example.Schedule.ScheduleDto.UserVODTO;
import com.example.Schedule.ScheduleService.SubjectServiceImp;
import com.example.Schedule.ScheduleService.UserScheduleServiceImp;
import com.example.Schedule.ScheduleVO.*;
import com.example.Schedule.SubjectClassVO.SubjectClass;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.Subject;

@Controller
public class HomeController {

    @Autowired
    private UserScheduleServiceImp userScheduleServiceImp;

    @Autowired
    private SubjectServiceImp subjectServiceImp;

    // 로그인
    @GetMapping("/login")
    public String LoginSchedule() {

//        model.addAttribute("identity", new UserVODTO());
        return "/login";
    }

    @PostMapping("/login")
    public String LoginSchedule(String userid, Model model) {
        UserVO userVO1 = userScheduleServiceImp.findUserVOByUserid(userid);
        model.addAttribute("user", userVO1);
        return "/home";
    }

    // 회원정보 생성
    @GetMapping("/userInform")
    public String insertSchedule(Model model) throws Exception {
        model.addAttribute("signUp", new UserVO());
        return "/userInform";
    }

    // 회원정보 저장
    @PostMapping("/userAdd")
    public String insertSchedule(@ModelAttribute UserVO userVO, Model model) throws Exception {
        UserVO userVO1 = userScheduleServiceImp.saveUserVO(userVO);
        userScheduleServiceImp.addUserVO(userVO1);
        model.addAttribute("user", userVO1);
        return "/login";
    }

    // 과목 저장 (모든 사용자가 접근 가능하게 만듬)
    @GetMapping("/{userid}/subjectInsert")
    public String insertSubject(@PathVariable String userid , Model model){
        UserVO userVO = userScheduleServiceImp.findUserVOByUserid(userid);
        model.addAttribute("subject", new SubjectClass());
        model.addAttribute("user", userVO);
        return "subjectInsert";
    }

    // 만약 두번 입력해서 받을 경우.
    // 입력받은 과목의 시간이 겹칠 경우.

    @PostMapping("/subjectAdd")
    public String insertSubject(@ModelAttribute SubjectClass subjectClass, Model model,
                                @RequestParam("userid") String userid)
    {
        SubjectClass subjectClass2 = subjectServiceImp.findBySubject(subjectClass.getSubjectSt(),subjectClass.getSubjectFn());
        // DB에 해당 시간과 중복이 되는지 안되는지 확인 (과목 시작시간, 끝나는 시간)
        if (subjectClass2 == null) {
            SubjectClass subjectClass1 = subjectServiceImp.addSubject(subjectClass); // 입력받은 정보를 저장
            model.addAttribute("subject", subjectClass1);

            UserVO userVO = userScheduleServiceImp.findUserVOByUserid(userid); // 받은 파라미터로 user의 정보 가져옴
            model.addAttribute("user", userVO);

            if ("월요일".equals(subjectClass1.getDay()) == true) { // 월요일에 입력할 경우
                UserScheduleMonday userScheduleMonday = userScheduleServiceImp.saveMonday(subjectClass1); // 월요일 클래스에 저장
                if (subjectClass1.getSubjectSt() <= userScheduleMonday.getSubfinal() - userScheduleMonday.getSubstart() + 1 &&
                        userScheduleMonday.getSubfinal() - userScheduleMonday.getSubstart() + 1 <= subjectClass1.getSubjectFn())
                    // 3교시 수업 시작 <= 5-3+1 || 5-3+1 <= 5교시 수업 끝
                    // 3 <= 3 || 3 <= 5
                    // 4교시 수업 시작 <= 5-4+1 || 5-4+1 <= 5교시 수업 끝
                    // 4 <= 2 || 2 <= 5
                    userScheduleServiceImp.addMonday(userScheduleMonday, userVO.getId()); // 연관관계 형성하기.
            }
        }
        return "/home";
    }

    // 월요일
//    @GetMapping("/scheduleList/scheduleInsertMonday")
//    public String insertScheduleMonday(@ModelAttribute SubjectClass subjectClass, Model model) {
//        model.addAttribute("monday", new UserScheduleMonday());
//        return "/scheduleList/scheduleInsertMonday";
//    }
//
//    @PostMapping("addMonday")
//    public String insertScheduleMonday(@RequestParam int id, Model model) throws Exception {
//
//        return "redirect:/home";
//    }
}
