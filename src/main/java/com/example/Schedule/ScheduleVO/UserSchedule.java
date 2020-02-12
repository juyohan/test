package com.example.Schedule.ScheduleVO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity // DB와 연결될 클래스를 명시해줌
@ToString
// DB를 사용해 데이터를 조회하거나 조작하는 기능을 수행하도록 만든 객체이다.
public class UserSchedule {

    @Id // PK를 지정해줌 (Primary Key)
    @Column(name="USERSCHEDULE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동으로 값을 1씩 증가시켜줌.
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // 회원 정보
    @ManyToOne
    @JoinColumn(name="USERVO_ID")
    private UserVO userVO;

    public UserVO getUserVO() {
        return userVO;
    }

    public void setUserVO(UserVO userVO) {
        this.userVO = userVO;
    }

    public UserSchedule(UserVO userVO){
        this.userVO = userVO;
    }

    // 월요일
    @ManyToOne
    @JoinColumn(name="USERSCHEDULEMONDAY_ID")
    private UserScheduleMonday userScheduleMonday;

    public UserScheduleMonday getUserScheduleMonday() {
        return userScheduleMonday;
    }

    public void setUserScheduleMonday(UserScheduleMonday userScheduleMonday) {
        this.userScheduleMonday = userScheduleMonday;
    }

    public UserSchedule(UserScheduleMonday userScheduleMonday){
        this.userScheduleMonday=userScheduleMonday;
    }

    // 화요일
    @ManyToOne
    @JoinColumn(name="USERSCHEDULETUESDAY_ID")
    private UserScheduleTuesday userScheduleTuesday;

    public UserScheduleTuesday getUserScheduleTuesday() {
        return userScheduleTuesday;
    }

    public void setUserScheduleTuesday(UserScheduleTuesday userScheduleTuesday) {
        this.userScheduleTuesday = userScheduleTuesday;
    }

   // 수요일
    @ManyToOne
    @JoinColumn(name="USERSCHEDULEWEDNESDAY_ID")
    private UserScheduleWednesday userScheduleWednesday;

    public UserScheduleWednesday getUserScheduleWednesday() {
        return userScheduleWednesday;
    }

    public void setUserScheduleWednesday(UserScheduleWednesday userScheduleWednesday) {
        this.userScheduleWednesday = userScheduleWednesday;
    }

    // 목요일
    @ManyToOne
    @JoinColumn(name="USERSCHEDULETHURSDAY_ID")
    private UserScheduleThursday userScheduleThursday;

    public UserScheduleThursday getUserScheduleThursday() {
        return userScheduleThursday;
    }

    public void setUserScheduleThursday(UserScheduleThursday userScheduleThursday) {
        this.userScheduleThursday = userScheduleThursday;
    }

    // 금요일
    @ManyToOne
    @JoinColumn(name="USERSCHEDULEFRIDAY_ID")
    private UserScheduleFriday userScheduleFriday;

    public UserScheduleFriday getUserScheduleFriday() {
        return userScheduleFriday;
    }

    public void setUserScheduleFriday(UserScheduleFriday userScheduleFriday) {
        this.userScheduleFriday = userScheduleFriday;
    }

    public UserSchedule(){ // 기본 생성자 생성하자.
    }
}
