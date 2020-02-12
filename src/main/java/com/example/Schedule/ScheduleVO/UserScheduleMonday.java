package com.example.Schedule.ScheduleVO;

import com.example.Schedule.SubjectClassVO.SubjectClass;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ToString
@Entity
public class UserScheduleMonday implements Serializable {

    @Id
    @Column(name="USERSCHEDULEMONDAY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "SUBJECT_ID")
//    private SubjectClass subjectClass;
//
//    public SubjectClass getSubjectClass() {
//        return subjectClass;
//    }
//
//    public void setSubjectClass(SubjectClass subjectClass) {
//        this.subjectClass = subjectClass;
//    }
    private String subteacher;
    private String subroom;
    private Long substart;
    private Long subfinal;
    private String subname;
    private Long subpoint;

    public String getSubteacher() {
        return subteacher;
    }

    public void setSubteacher(String subteacher) {
        this.subteacher = subteacher;
    }

    public String getSubroom() {
        return subroom;
    }

    public void setSubroom(String subroom) {
        this.subroom = subroom;
    }

    public Long getSubstart() {
        return substart;
    }

    public void setSubstart(Long substart) {
        this.substart = substart;
    }

    public Long getSubfinal() {
        return subfinal;
    }

    public void setSubfinal(Long subfinal) {
        this.subfinal = subfinal;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public Long getSubpoint() {
        return subpoint;
    }

    public void setSubpoint(Long subpoint) {
        this.subpoint = subpoint;
    }

    public UserScheduleMonday(String subteacher, String subroom, Long substart,Long subfinal, String subname, Long subpoint){
        this.subteacher = subteacher;
        this.subroom = subroom;
        this.substart = substart;
        this.subfinal = subfinal;
        this.subname = subname;
        this.subpoint = subpoint;
    }
    public UserScheduleMonday(){}

    @OneToMany(mappedBy = "userScheduleMonday", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<UserSchedule> userScheduleList = new ArrayList<>();

    public List<UserSchedule> getUserScheduleList() {
        return userScheduleList;
    }

    public void setUserScheduleList(List<UserSchedule> userScheduleList) {
        this.userScheduleList = userScheduleList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
