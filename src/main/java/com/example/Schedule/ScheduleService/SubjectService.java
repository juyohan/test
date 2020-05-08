package com.example.Schedule.ScheduleService;

import com.example.Schedule.ScheduleDto.SubjectClassDTO;
import com.example.Schedule.SubjectClassVO.SubjectClass;

import java.util.List;

public interface SubjectService {
    public SubjectClass subjectSave(SubjectClass subjectClass);

    public List<SubjectClass> subjectFindUserid(String userid);

    public boolean subjectFindTime(List<SubjectClass> subjectClassList, SubjectClass subjectClass);

    public boolean subjectFindName(List<SubjectClass> subjectClassList, SubjectClass subjectClass);

    public List<SubjectClass> subjectListFind(String userid, String day);
}