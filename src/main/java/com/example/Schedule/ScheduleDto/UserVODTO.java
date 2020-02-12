package com.example.Schedule.ScheduleDto;

public class UserVODTO {
    private String useridentity;
    private String userpassword;

    public String getUseridentity() {
        return useridentity;
    }

    public void setUseridentity(String useridentity) {
        this.useridentity = useridentity;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    @Override
    public String toString() {
        return "UserVODTO{" +
                "useridentity='" + useridentity + '\'' +
                ", userpassword='" + userpassword + '\'' +
                '}';
    }
}
