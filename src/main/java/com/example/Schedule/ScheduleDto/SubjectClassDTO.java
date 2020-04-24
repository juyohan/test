package com.example.Schedule.ScheduleDto;

import com.example.Schedule.SubjectClassVO.SubjectClass;
import lombok.ToString;

import javax.persistence.*;

@ToString
public class SubjectClassDTO extends SubjectClass {

    private String subjectNm;
    private String teacher;
    private String day;
    private Long subjectSt;
    private Long subjectFn;
    private String subjectRm;
    private Long subjectMP;

    private String userid;

    public SubjectClassDTO(){}

    public SubjectClassDTO(String userid){
        this.userid = userid;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Long getSubjectSt() {
        return subjectSt;
    }

    public void setSubjectSt(Long subjectSt) {
        this.subjectSt = subjectSt;
    }

    public Long getSubjectFn() {
        return subjectFn;
    }

    public void setSubjectFn(Long subjectFn) {
        this.subjectFn = subjectFn;
    }

    public String getSubjectRm() {
        return subjectRm;
    }

    public void setSubjectRm(String subjectRm) {
        this.subjectRm = subjectRm;
    }

    public Long getSubjectMP() {
        return subjectMP;
    }

    public void setSubjectMP(Long subjectMP) {
        this.subjectMP = subjectMP;
    }

    public String getSubjectNm() {
        return subjectNm;
    }

    public void setSubjectNm(String subjectNm) {
        this.subjectNm = subjectNm;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
