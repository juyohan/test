package com.example.Schedule.ScheduleController;

import com.example.Schedule.ScheduleService.SubjectServiceImp;
import com.example.Schedule.ScheduleService.UserScheduleServiceImp;
import com.example.Schedule.ScheduleVO.*;
import com.example.Schedule.SubjectClassVO.SubjectClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UserScheduleServiceImp userScheduleServiceImp;

    @Autowired
    private SubjectServiceImp subjectServiceImp;

    // 로그인
    @GetMapping("/login")
    public String LoginSchedule() {
        return "/login";
    }

    @PostMapping("/login")
    public String LoginSchedule(String userid,  HttpServletResponse response ,HttpServletRequest request) {
        UserVO userVO = userScheduleServiceImp.findUserVOByUserid(userid); // 해당 아이디값이 DB에 있는지 확인

        if (userVO != null) {
            HttpSession httpSession = request.getSession(true);
            // true : 세션이 있다면 세션 값을 돌려주고 만약 없다면 생성시켜준다. || false : 세션이 있다면 세션 값을 돌려주고 만약 없다면 Null값을 돌려준다.
            httpSession.setAttribute("sessionUser", userVO); // user라는 이름으로 userVO의 객체를 세션에 저장함. == session.setAttribute("Key", Value);
            Cookie cookie = new Cookie("storeIdCookie", httpSession.getId()); // storeIdCookie라는 이름을 가지며 그의 값은 userVO.getUserid()의 값을 가진 cookie를 생성
            cookie.setPath("/"); // "/"를 포함한 url에 모든 쿠키 적용
            cookie.setMaxAge(-1); // browser를 닫으면 쿠키도 삭제
            response.addCookie(cookie); // 클라이언트에 cookie를 저장하며, 같은 이름의 cookie가 들어오면 기존에 있던 cookie와 교체한다.

            return "/home";
        }
        else
            return "/login";
    }

    // 회원정보 생성
    @GetMapping("/userInform") // 해당 뷰로 매핑
    public String createUserVO(@ModelAttribute("signUp") UserVO userVO){
        // @ModelAttribute 어노테이션을 통해 ("signUp")이라는 변수이름을 갖는 userVO라는 객체를 생성한 뒤 해당 뷰로 객체를 보내 연결한다.
        return "/userInform"; // 뷰에서 입력받은 해당 객체를 다시 userInform의 뷰로 반환시켜준다.
    }

    // 회원정보 저장
    @PostMapping("/userAdd") // 해당 뷰에서 받은 userVO라는 객체를 해
    public String saveUserVO(UserVO userVO){
        userScheduleServiceImp.saveUserVO(userVO);
        return "/login";
    }

    // 과목 저장 (모든 사용자가 접근 가능하게 만듬)
    @GetMapping("/subjectInsert")
    public String insertSubject(Model model, HttpServletRequest request){
        model.addAttribute("subject", new SubjectClass());
        HttpSession httpSession = request.getSession(false); // 세션이 있다면 세션의 값을 가져오고 없으면 null값을 반환.
        if (httpSession != null) {
            UserVO userVO = (UserVO) httpSession.getAttribute("sessionUser"); // sessionUser이름으로 저장한 변수 이름의 세션의 정보를 가져옴
            model.addAttribute("user", userVO.getUserid());
            return "subjectInsert";
        }
        else
            return "/home";
    }

    // 만약 두번 입력해서 받을 경우.
    // 입력받은 과목의 시간이 겹칠 경우.
    @PostMapping("/subjectAdd")
    public String insertSubject(@ModelAttribute SubjectClass subjectClass, Model model)
    {

        boolean name = false , time = false;

        List<SubjectClass> subjectClassList = subjectServiceImp.subjectFindList(subjectClass); // 입력한 이름과 요일 / 과목명에 해당하는 값을 가져옴

        for (int i = 0 ; i < 2 ; i++) {
            if (i == 0) {
                name = subjectServiceImp.subjectFindName(subjectClassList, subjectClass);  // 정렬한 시간표에 중복된 과목명이 있는지 확인
            }
            else if (i == 1){
                time = subjectServiceImp.subjectFindTime(subjectClassList, subjectClass); // 정렬한 시간표에 중복된 시간이 있는지 확인
            }
        }

        boolean value = name || time;

        if (value == false){
            SubjectClass subjectClass1 = subjectServiceImp.subjectSave(subjectClass);
            model.addAttribute("test", subjectClass1);
        }
        else if (value == true){
            return "/subjectInsert";
        }

        return "/home";
    }

    @GetMapping("/subjectSelectDay")
    public String selectDaySubject(HttpServletRequest request){
//        HttpSession httpSession = request.getSession(false);
//        UserVO userVO = (UserVO) httpSession.getAttribute("sessionUser");

        return "/subjectSelectDay";
    }

    @PostMapping("/subjectSelectDay")
    public String selectDaySubject(@RequestParam(value = "ChooseDay") String chooseDay, Model model, HttpServletRequest request){
        HttpSession httpSession = request.getSession(false);
        UserVO userVO = (UserVO) httpSession.getAttribute("sessionUser");
        System.out.println(userVO.toString());
        System.out.println(chooseDay);

        List<SubjectClass> subjectClassList = subjectServiceImp.subjectListFind(userVO.getUserid(), chooseDay);

        model.addAttribute("subjectList", subjectClassList);

        System.out.println(subjectClassList);

        return "/subjectModify";
    }

    @GetMapping("/subjectModify")
    public String modifySubject( Model model){
        System.out.println("sdfsdfsdf");
        return "/subjectModify";
    }

    @PostMapping("/subjectModify")
    public String selectMajorSubject(){
        return "/subjectModify";
    }

//    @GetMapping("/{userid}/show")
//    public String showSubject(@PathVariable String userid, Model model){
//        List<SubjectClass> subjectClassList = subjectServiceImp.searchSubjectByUserIdAndDay(userid, subjectClass.getDay());
//        model.addAttribute("test", subjectClassList);
//
//        return "/show";
//    }
}
