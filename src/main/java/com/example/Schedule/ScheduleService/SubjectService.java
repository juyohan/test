package com.example.Schedule.ScheduleService;

import com.example.Schedule.SubjectClassVO.SubjectClass;

public interface SubjectService {
    public SubjectClass addSubject(SubjectClass subjectClass);
    public SubjectClass findBySubject(Long st, Long fn);
}
