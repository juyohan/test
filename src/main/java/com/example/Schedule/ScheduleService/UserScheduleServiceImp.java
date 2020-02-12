package com.example.Schedule.ScheduleService;

        import com.example.Schedule.ScheduleDao.*;
        import com.example.Schedule.ScheduleVO.*;
        import com.example.Schedule.SubjectClassVO.SubjectClass;
        import com.example.Schedule.SubjectClassVO.SubjectClassRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

// 이게 논리적인 작업을 여기서 수행한다. dto가
@Service
public class UserScheduleServiceImp implements UserScheduleService {

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

    @Autowired
    private UserVORepository userVORepository;

    @Autowired
    private UserScheduleRepository userScheduleRepository;

    // 회원 정보 저장
    @Override
    public UserVO saveUserVO(UserVO userVO) {
        return userVORepository.save(userVO);
    }

    @Override
    public UserScheduleMonday saveMonday(SubjectClass subjectClass) {
        UserScheduleMonday userScheduleMonday = new UserScheduleMonday(subjectClass.getTeacher(), subjectClass.getSubjectRm(), subjectClass.getSubjectSt(), subjectClass.getSubjectFn(),
                subjectClass.getSubjectNm(), subjectClass.getSubjectMP());
        return userScheduleMondayRepository.save(userScheduleMonday);
    }

    @Override
    public UserScheduleTuesday saveTuesday(UserScheduleTuesday userScheduleTuesday, String username) {
        return null;
    }

    @Override
    public UserScheduleWednesday saveWednesday(UserScheduleWednesday userScheduleWednesday, String username) {
        return null;
    }

    @Override
    public UserScheduleThursday saveThursday(UserScheduleThursday userScheduleThursday, String username) {
        return null;
    }

    @Override
    public UserScheduleFriday saveFriday(UserScheduleFriday userScheduleFriday, String username) {
        return null;
    }

    @Override
    public UserVO findUserVOByUserid(String userid) {
        return (UserVO) userVORepository.findByUserid(userid);
    }

    //회원정보 연관관계 설정
    @Override
    public UserSchedule addUserVO(UserVO userVO) {
        UserSchedule userSchedule = new UserSchedule(userVO);
        return userScheduleRepository.save(userSchedule);
    }

    @Override
    public UserSchedule addMonday(UserScheduleMonday userScheduleMonday, Long seq) {
        UserSchedule userSchedule = userScheduleRepository.findById(seq).orElse(null); // .orElse는 Optional객체에서 반환하는 값이 null 일때 ()안에 있는 해당 메소드를 반환한다.
        if(seq == null) {
            userSchedule.setUserScheduleMonday(userScheduleMonday);
            return userScheduleRepository.save(userSchedule);
        }
        else {
            return null;
        }
    }
}