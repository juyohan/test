//package com.example.Schedule.ScheduleDto;
//
//import com.example.Schedule.ScheduleVO.UserSchedule;
//import lombok.*;
//
//import java.time.LocalDateTime;
//
//@NoArgsConstructor
//// 이게 DB에 접근하는 객체이다. (DTO = VO)but, VO는 읽는것만 수행.
//public class UserScheduleDto {
//    private Long id;
//    private String userId;
//    private String mon;
//    private String tue;
//    private String wed;
//    private String thu;
//    private String fri;
//    private LocalDateTime localDateTime;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
//    public String getMon() {
//        return mon;
//    }
//
//    public void setMon(String mon) {
//        this.mon = mon;
//    }
//
//    public String getTue() {
//        return tue;
//    }
//
//    public void setTue(String tue) {
//        this.tue = tue;
//    }
//
//    public String getWed() {
//        return wed;
//    }
//
//    public void setWed(String wed) {
//        this.wed = wed;
//    }
//
//    public String getThu() {
//        return thu;
//    }
//
//    public void setThu(String thu) {
//        this.thu = thu;
//    }
//
//    public String getFri() {
//        return fri;
//    }
//
//    public void setFri(String fri) {
//        this.fri = fri;
//    }
//
//    public LocalDateTime getLocalDateTime() {
//        return localDateTime;
//    }
//
//    public void setLocalDateTime(LocalDateTime localDateTime) {
//        this.localDateTime = localDateTime;
//    }
//
//    public UserSchedule toEntity() {
//        UserSchedule.UserScheduleBuilder builder = UserSchedule.builder();
//        builder.id(id);
//        builder.userId(userId);
//        builder.mon(mon);
//        builder.tue(tue);
//        builder.wed(wed);
//        builder.thu(thu);
//        builder.fri(fri);
//        UserSchedule build = builder
//                .build();
//        return build;
//    }
//
//    @Builder
//    public UserScheduleDto(Long id, String userId, String mon, String tue, String wed, String thu, String fri, LocalDateTime localDateTime){
//        this.id=id;
//        this.userId=userId;
//        this.mon=mon;
//        this.tue=tue;
//        this.wed=wed;
//        this.thu=thu;
//        this.fri=fri;
//        this.localDateTime=localDateTime;
//    }
//
//}
