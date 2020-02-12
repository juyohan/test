package com.example.Schedule.SubjectClassVO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectClassRepository extends JpaRepository<SubjectClass, Long> {
    SubjectClass findBySubjectSt(Long st);
    SubjectClass findBySubjectFn(Long fn);

}
