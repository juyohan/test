package com.example.Schedule.ScheduleService;

import com.example.Schedule.ScheduleVO.*;

import java.util.Set;

public interface UserScheduleService {

    // 각 테이블에 데이터 값 저장.
    public UserVO saveUserVO (UserVO userVO);

    // 이름 찾기.
    public UserVO findUserVOByUserid(String userid);

}
