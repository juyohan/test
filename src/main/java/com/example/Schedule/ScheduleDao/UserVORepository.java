package com.example.Schedule.ScheduleDao;

import com.example.Schedule.ScheduleVO.UserSchedule;
import com.example.Schedule.ScheduleVO.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserVORepository extends JpaRepository<UserVO, Long> {
//    UserVO findByMajorNb(String majorNb);
    UserVO findByUserid(String userid);
}
