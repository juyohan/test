package com.example.Schedule.ScheduleDao;

        import com.example.Schedule.ScheduleVO.UserSchedule;
        import com.example.Schedule.ScheduleVO.UserScheduleMonday;
        import com.example.Schedule.ScheduleVO.UserVO;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public interface UserScheduleMondayRepository extends JpaRepository<UserScheduleMonday, Long> {
        List<UserScheduleMonday> findByUserId(UserVO userid);
}
