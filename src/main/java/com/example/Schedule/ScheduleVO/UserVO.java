package com.example.Schedule.ScheduleVO;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class UserVO implements Serializable {

    @Id
    @Column(name="USERVO_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userid;
    private String userPassword;
    private String username;
    private String birth;
    private String majorNb;
    private String phoneNb;

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getMajorNb() {
        return majorNb;
    }

    public void setMajorNb(String majorNb) {
        this.majorNb = majorNb;
    }

    public String getPhoneNb() {
        return phoneNb;
    }

    public void setPhoneNb(String phoneNb) {
        this.phoneNb = phoneNb;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserVO(){
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", username='" + username + '\'' +
                ", birth='" + birth + '\'' +
                ", majorNb='" + majorNb + '\'' +
                ", phoneNb='" + phoneNb + '\'' +
                '}';
    }

    //    public UserVO(String userid, String userPassword, String username, String birth, String majorNb, String phoneNb){
//        this.userid = userid;
//        this.userPassword = userPassword;
//        this.username = username;
//        this.birth = birth;
//        this.majorNb = majorNb;
//        this.phoneNb = phoneNb;
//    }
}
