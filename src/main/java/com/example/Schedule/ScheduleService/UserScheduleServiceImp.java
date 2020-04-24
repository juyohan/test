package com.example.Schedule.ScheduleService;

        import com.example.Schedule.ScheduleDao.*;
        import com.example.Schedule.ScheduleVO.*;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

@Service
public class UserScheduleServiceImp implements UserScheduleService {

    @Autowired
    private UserVORepository userVORepository;

    // 회원 정보 저장
    @Override
    public UserVO saveUserVO(UserVO userVO) {
        return userVORepository.save(userVO);
    }

    // id 유무 찾기
    @Override
    public UserVO findUserVOByUserid(String userid) {
        UserVO userVO = userVORepository.findByUserid(userid);
        if (userVO != null)
            return (UserVO) userVORepository.findByUserid(userid);
        else
            return null;
    }

}