package com.example.Schedule.ScheduleVO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity // DB와 연결될 클래스를 명시해줌
@ToString
// DB를 사용해 데이터를 조회하거나 조작하는 기능을 수행하도록 만든 객체이다.
public class UserSchedule {

    @Id // PK를 지정해줌 (Primary Key)
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동으로 값을 1씩 증가시켜줌.
    private Long id;
    private String userId;
//    private String tue;
//    private String wed;
//    private String thu;
//    private String fri;
//    private UserScheduleMonday userScheduleMonday;

//    public UserSchedule(){
//    }
//
//    public UserSchedule(Long id, String userId, String tue, String wed, String thu, String fri, UserScheduleMonday userScheduleMonday){
//        this.id=id;
//        this.userId=userId;
//        this.tue=tue;
//        this.wed=wed;
//        this.thu=thu;
//        this.fri=fri;
//        this.userScheduleMonday=userScheduleMonday;
//    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //    @OneToMany(mappedBy = "userSchedule", fetch = FetchType.EAGER, cascade = CascadeType.ALL,targetEntity = UserScheduleMonday.class)
//    private List<UserScheduleMonday> userScheduleMondays;
//
//    public void addSchedule(UserScheduleMonday userScheduleMonday){
//        this.userScheduleMondays.add(userScheduleMonday);
//        userScheduleMonday.setUserSchedule(this);
//    }
//
//    public List<UserScheduleMonday> getUserScheduleMondays() {
//        return userScheduleMondays;
//    }
//
//    public void setUserScheduleMondays(List<UserScheduleMonday> userScheduleMondays) {
//        this.userScheduleMondays = userScheduleMondays;
//    }
}
