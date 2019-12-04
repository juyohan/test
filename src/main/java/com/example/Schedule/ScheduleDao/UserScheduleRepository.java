package com.example.Schedule.ScheduleDao;

import com.example.Schedule.ScheduleVO.UserSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// 이게 DAO역할
@Repository
public interface UserScheduleRepository extends JpaRepository<UserSchedule, Long> {
    List<UserSchedule> findByUserId(String userId); // Id의 값을 where절을 통해 가져오도록 함.
    // 쿼리의 리스트를 설정해서 자동으로 userId에 맞춰서 실행시켜준다.
    //findBy로 시작하게 되면 이 쿼리가 메소드임을 알려준다.
}
