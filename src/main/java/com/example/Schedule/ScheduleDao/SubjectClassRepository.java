package com.example.Schedule.ScheduleDao;

import com.example.Schedule.SubjectClassVO.SubjectClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectClassRepository extends JpaRepository<SubjectClass, Long> {
   List<SubjectClass> findByUseridAndDay(String userid, String day); // 아이디 검색

}