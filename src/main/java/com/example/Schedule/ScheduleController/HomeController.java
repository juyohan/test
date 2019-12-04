package com.example.Schedule.ScheduleController;

import com.example.Schedule.ScheduleService.UserScheduleService;
import com.example.Schedule.ScheduleVO.*;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class HomeController {

    @Autowired
    private UserScheduleService userScheduleService;

    // 로그인
    @GetMapping("/")
    public String LoginSchedule(){
        return "/login";
    }

    // 로그인 후 메인메뉴
    @GetMapping("/home")
    public String homeSchedule(){
        return "/home";
    }

    // 시간표 요일 지정
    @GetMapping("/homes/scheduleHome")
    public String scheduleHome(){
        return "/homes/scheduleHome";
    }

    // 시간표 확인
    @GetMapping("/homes/scheduleShow")
    public String showSchedule(Model model) throws Exception {
        List<UserScheduleMonday> userList = userScheduleService.searchToSchedule();
        if (userList != null){
            model.addAttribute("userList", userList);
        }
        return "/homes/scheduleShow";
    }

    //회원정보
    @GetMapping("/userInform")
    public String insertSchedule() throws Exception{
        return "/userInform";
    }

    @PostMapping("/userInform")
    public String insertSchedule(UserSchedule userSchedule) throws Exception {
        userScheduleService.addToSchedule(userSchedule);
        return "redirect:/userInform";
    }

    // 월요일
    @GetMapping("/scheduleList/scheduleInsertMonday")
    public String insertScheduleMonday(){
        return "/scheduleList/scheduleInsertMonday";
    }

    @PostMapping("/scheduleList/scheduleInsertMonday")
    public String insertScheduleMonday(UserScheduleMonday userScheduleMonday) throws Exception {
        userScheduleService.addToScheduleMonday(userScheduleMonday);
        return "redirect:/homes/scheduleHome";
    }

    // 화요일
    @GetMapping("/scheduleList/scheduleInsertTuesday")
    public String insertScheduleTuesday(){
        return "/scheduleList/scheduleInsertTuesday";
    }

    @PostMapping("/scheduleList/scheduleInsertTuesday")
    public String insertScheduleTuesday(UserScheduleTuesday userScheduleTuesday) throws Exception {
        userScheduleService.addToScheduleTuesday(userScheduleTuesday);
        return "redirect:/homes/scheduleHome";
    }
    // 수요일
    @GetMapping("/scheduleList/scheduleInsertWednesday")
    public String insertScheduleWednesday(){
        return "/scheduleList/scheduleInsertWednesday";
    }

    @PostMapping("/scheduleList/scheduleInsertWednesday")
    public String insertScheduleWednesday(UserScheduleWednesday userScheduleWednesday) throws Exception {
        userScheduleService.addToScheduleWednesday(userScheduleWednesday);
        return "redirect:/homes/scheduleHome";
    }
    // 목요일
    @GetMapping("/scheduleList/scheduleInsertThursday")
    public String insertScheduleThursday(){
        return "/scheduleList/scheduleInsertThursday";
    }

    @PostMapping("/scheduleList/scheduleInsertThursday")
    public String insertScheduleThursday(UserScheduleThursday userScheduleThursday) throws Exception {
        userScheduleService.addToScheduleThursday(userScheduleThursday);
        return "redirect:/homes/scheduleHome";
    }
    // 금요일
    @GetMapping("/scheduleList/scheduleInsertFriday")
    public String insertScheduleFriday(){
        return "/scheduleList/scheduleInsertFriday";
    }

    @PostMapping("/scheduleList/scheduleInsertFriday")
    public String insertScheduleFriday(UserScheduleFriday userScheduleFriday) throws Exception {
        userScheduleService.addToScheduleFriday(userScheduleFriday);
        return "redirect:/homes/scheduleHome";
    }
}
