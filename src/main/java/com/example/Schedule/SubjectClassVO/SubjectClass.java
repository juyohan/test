package com.example.Schedule.SubjectClassVO;

import com.example.Schedule.ScheduleVO.UserScheduleFriday;
import com.example.Schedule.ScheduleVO.UserScheduleMonday;
import com.example.Schedule.ScheduleVO.UserVO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SubjectClass {

    @Id
    @Column(name="SUBJECT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teacher;
    private String day;
    private Long subjectSt;
    private Long subjectFn;
    private String subjectRm;
    private Long subjectMP;
    private String subjectNm;

    private UserVO user;

    public UserVO getUser() {
        return user;
    }

    public void setUser(UserVO user) {
        this.user = user;
    }
    //    @OneToMany(mappedBy = "subjectClass", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private List<SubjectClass> subjectClassList = new ArrayList<>();
//
//    public List<SubjectClass> getSubjectClassList() {
//        return subjectClassList;
//    }
//
//    public void setSubjectClassList(List<SubjectClass> subjectClassList) {
//        this.subjectClassList = subjectClassList;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
