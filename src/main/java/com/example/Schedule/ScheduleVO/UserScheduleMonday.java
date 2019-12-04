package com.example.Schedule.ScheduleVO;

import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@ToString
@Entity
public class UserScheduleMonday {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstLesson;
    private String secondLesson;
    private String thirdLesson;
    private String fourthLesson;
    private String fifthLesson;
    private String sixthLesson;
    private String seventhLesson;
    private String eighthLesson;
    private String ninthLesson;
    private String tenthLesson;

//    @ManyToOne
//    @JoinColumn(name = "UserSchedule_id")
//    private UserSchedule userSchedule;
//
//    public UserSchedule getUserSchedule() {
//        return userSchedule;
//    }
//
//    public void setUserSchedule(UserSchedule userSchedule) {
//        this.userSchedule = userSchedule;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstLesson() {
        return firstLesson;
    }

    public void setFirstLesson(String firstLesson) {
        this.firstLesson = firstLesson;
    }

    public String getSecondLesson() {
        return secondLesson;
    }

    public void setSecondLesson(String secondLesson) {
        this.secondLesson = secondLesson;
    }

    public String getThirdLesson() {
        return thirdLesson;
    }

    public void setThirdLesson(String thirdLesson) {
        this.thirdLesson = thirdLesson;
    }

    public String getFourthLesson() {
        return fourthLesson;
    }

    public void setFourthLesson(String fourthLesson) {
        this.fourthLesson = fourthLesson;
    }

    public String getFifthLesson() {
        return fifthLesson;
    }

    public void setFifthLesson(String fifthLesson) {
        this.fifthLesson = fifthLesson;
    }

    public String getSixthLesson() {
        return sixthLesson;
    }

    public void setSixthLesson(String sixthLesson) {
        this.sixthLesson = sixthLesson;
    }

    public String getSeventhLesson() {
        return seventhLesson;
    }

    public void setSeventhLesson(String seventhLesson) {
        this.seventhLesson = seventhLesson;
    }

    public String getEighthLesson() {
        return eighthLesson;
    }

    public void setEighthLesson(String eighthLesson) {
        this.eighthLesson = eighthLesson;
    }

    public String getNinthLesson() {
        return ninthLesson;
    }

    public void setNinthLesson(String ninthLesson) {
        this.ninthLesson = ninthLesson;
    }

    public String getTenthLesson() {
        return tenthLesson;
    }

    public void setTenthLesson(String tenthLesson) {
        this.tenthLesson = tenthLesson;
    }

}
