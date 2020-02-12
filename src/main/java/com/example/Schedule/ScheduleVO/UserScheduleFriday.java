package com.example.Schedule.ScheduleVO;


import com.example.Schedule.SubjectClassVO.SubjectClass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@ToString
@Entity
public class UserScheduleFriday {

    @Id
    @Column(name="USERSCHEDULEFRIDAY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subteacher;
    private String subroom;
    private Long subtime;

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

    public Long getSubtime() {
        return subtime;
    }

    public void setSubtime(Long subtime) {
        this.subtime = subtime;
    }

    public UserScheduleFriday(String subteacher, String subroom, Long subtime){
        this.subteacher = subteacher;
        this.subroom = subroom;
        this.subtime = subtime;
    }
    public UserScheduleFriday(){}

    @OneToMany(mappedBy = "userScheduleFriday", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
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
