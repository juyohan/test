package com.example.Schedule.ScheduleVO;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ToString
@Entity
public class UserScheduleFriday {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userId;
    private String firstLesson;
    private String secondLesson;
    private String thirdLesson;
    private String firthLesson;
    private String fifthLesson;
    private String sixthLesson;
    private String seventhLesson;
    private String eighthLesson;
    private String ninthLesson;
    private String tenthLesson;

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

    public String getFirthLesson() {
        return firthLesson;
    }

    public void setFirthLesson(String firthLesson) {
        this.firthLesson = firthLesson;
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
