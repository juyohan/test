package com.example.Schedule.ScheduleDao;

import com.example.Schedule.ScheduleVO.UserSchedule;
import com.example.Schedule.ScheduleVO.UserScheduleThursday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserScheduleThursdayRepository extends JpaRepository<UserScheduleThursday, Long> {
//    List<UserScheduleThursday> findByUserId(String userId);
}
