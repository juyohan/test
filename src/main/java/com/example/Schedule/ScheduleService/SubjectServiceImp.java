package com.example.Schedule.ScheduleService;

import com.example.Schedule.ScheduleDao.UserVORepository;
import com.example.Schedule.SubjectClassVO.SubjectClass;
import com.example.Schedule.SubjectClassVO.SubjectClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImp implements SubjectService {

    @Autowired
    private SubjectClassRepository subjectClassRepository;

    @Autowired
    private UserVORepository userVORepository;

    @Override
    public SubjectClass addSubject(SubjectClass subjectClass) {
        return subjectClassRepository.save(subjectClass);
    }

    @Override
    public SubjectClass findBySubject(Long st, Long fn) {
        subjectClassRepository.findBySubjectSt(st);
        return null;
    }
}
