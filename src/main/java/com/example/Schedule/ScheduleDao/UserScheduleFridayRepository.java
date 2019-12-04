package com.example.Schedule.ScheduleDao;

import com.example.Schedule.ScheduleVO.UserSchedule;
import com.example.Schedule.ScheduleVO.UserScheduleFriday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserScheduleFridayRepository extends JpaRepository<UserScheduleFriday, Long> {
//    List<UserSchedule> findByUserId(String userId);
}
