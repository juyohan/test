package com.example.Schedule.ScheduleService;

        import com.example.Schedule.ScheduleDao.*;
        import com.example.Schedule.ScheduleVO.*;
        import lombok.AllArgsConstructor;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;
        import java.lang.Exception;

// 이게 논리적인 작업을 여기서 수행한다. dto가
@Service
@AllArgsConstructor
public class UserScheduleService {
    private static final String userId="yohan";

    @Autowired
    private UserScheduleRepository userScheduleRepository;

    @Autowired
    private UserScheduleMondayRepository userScheduleMondayRepository;

    @Autowired
    private UserScheduleTuesdayRepository userScheduleTuesdayRepository;

    @Autowired
    private UserScheduleWednesdayRepository userScheduleWednesdayRepository;

    @Autowired
    private UserScheduleThursdayRepository userScheduleThursdayRepository;

    @Autowired
    private UserScheduleFridayRepository userScheduleFridayRepository;

    // 데이터 저장 (유저 정보)
    public UserSchedule addToSchedule(UserSchedule userSchedule) throws Exception {
        userSchedule.setUserId(userId);
        return userScheduleRepository.save(userSchedule);
    }
    // 월요일
    public UserScheduleMonday addToScheduleMonday(UserScheduleMonday userScheduleMonday) throws Exception{

        return userScheduleMondayRepository.save(userScheduleMonday);
    }

    // 화요일
    public UserScheduleTuesday addToScheduleTuesday(UserScheduleTuesday userScheduleTuesday) throws Exception{
        return userScheduleTuesdayRepository.save(userScheduleTuesday);
    }

    //수요일
    public UserScheduleWednesday addToScheduleWednesday(UserScheduleWednesday userScheduleWednesday) throws Exception{
        return userScheduleWednesdayRepository.save(userScheduleWednesday);
    }

    // 목요일
    public UserScheduleThursday addToScheduleThursday(UserScheduleThursday userScheduleThursday) throws Exception{
        return userScheduleThursdayRepository.save(userScheduleThursday);
    }

    //금요일
    public UserScheduleFriday addToScheduleFriday(UserScheduleFriday userScheduleFriday) throws Exception{
        return userScheduleFridayRepository.save(userScheduleFriday);
    }


    // 데이터 조회
    public List<UserScheduleMonday> searchToSchedule() throws Exception {
        List<UserScheduleMonday> userScheduleMondayList = userScheduleMondayRepository.findByUserId(userId
        );
        return userScheduleMondayList;
    }
}