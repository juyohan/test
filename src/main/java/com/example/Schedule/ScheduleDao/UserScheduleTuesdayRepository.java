package com.example.Schedule.ScheduleDao;

import com.example.Schedule.ScheduleVO.UserSchedule;
import com.example.Schedule.ScheduleVO.UserScheduleTuesday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserScheduleTuesdayRepository extends JpaRepository<UserScheduleTuesday, Long> {
    List<UserSchedule> findByUserId(String userId);
}
