package com.example.Schedule.ScheduleService;

import com.example.Schedule.ScheduleVO.*;
import com.example.Schedule.SubjectClassVO.SubjectClass;

public interface UserScheduleService {

    // 각 테이블에 데이터 값 저장.
    public UserVO saveUserVO (UserVO userVO);
    public UserScheduleMonday saveMonday(SubjectClass subjectClass);
    public UserScheduleTuesday saveTuesday(UserScheduleTuesday userScheduleTuesday, String username);
    public UserScheduleWednesday saveWednesday(UserScheduleWednesday userScheduleWednesday, String username);
    public UserScheduleThursday saveThursday(UserScheduleThursday userScheduleThursday, String username);
    public UserScheduleFriday saveFriday(UserScheduleFriday userScheduleFriday, String username);

    // 이름 찾기.
//    public UserVO findByMajorNb(String majorNb);
    public UserVO findUserVOByUserid(String userid);

    // UserSchedule 테이블에 연관관계 만들기.
    public UserSchedule addUserVO(UserVO userVO);
    public UserSchedule addMonday(UserScheduleMonday userScheduleMonday,Long seq);

    // 해당 요일에 저장된 시간과 입력한 시간이 동일한 경우

}
