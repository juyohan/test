package com.example.Schedule.ScheduleDao;

import com.example.Schedule.ScheduleVO.UserSchedule;
import com.example.Schedule.ScheduleVO.UserScheduleWednesday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserScheduleWednesdayRepository extends JpaRepository<UserScheduleWednesday, Long> {
//    List<UserScheduleWednesday> findByUserId(String userId);
}
