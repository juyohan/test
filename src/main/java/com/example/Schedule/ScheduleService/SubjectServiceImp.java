package com.example.Schedule.ScheduleService;

import com.example.Schedule.ScheduleDto.SubjectClassDTO;
import com.example.Schedule.SubjectClassVO.SubjectClass;
import com.example.Schedule.ScheduleDao.SubjectClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class SubjectServiceImp implements SubjectService {

    @Autowired
    private SubjectClassRepository subjectClassRepository;

    // 입력받은 시간표를 db에 저장
    @Override
    public SubjectClass subjectSave(SubjectClass subjectClass) {
        return subjectClassRepository.save(subjectClass);
    }

    // id와 요일 or 과목명으로 해당 시간표를 찾은 후 대입
    @Override
    public List<SubjectClass> subjectFindUserid(String userid) {
            List<SubjectClass> subjectClassList = subjectClassRepository.findByUserid(userid);
            return subjectClassList;
    }

    // 해당 요일에 시간이 포함되거나 중복되는 것을 찾음
    @Override
    public boolean subjectFindTime(List<SubjectClass> subjectClassList, SubjectClass subjectClass) {

        int dbSt = 0, dbFn = 0;
        boolean value = false;

        for (int i = 0 ; i < subjectClassList.size() ; i++) {

            // id와 요일로 정렬된 List인 subjectClassList에 있는 St, Fn 의 값을 문자열 → Long → Int로 바꿔주고 각 변수에 대입
            // EX) db에 있는 St = 2, Fn = 4 라고 가정
            dbSt = Math.toIntExact(Long.parseLong(subjectClassList.get(i).getSubjectSt().toString()));
            dbFn = Math.toIntExact(Long.parseLong(subjectClassList.get(i).getSubjectFn().toString()));

            // 입력받은 값 subjectClass에 있는 St, Fn의 값을 각 변수에 대입
            // EX) 입력받은 값 St = 3, Fn = 5 라고 가정
            int addSt = Math.toIntExact(subjectClass.getSubjectSt());
            int addFn = Math.toIntExact(subjectClass.getSubjectFn());

//            for (int j = -1 ; j < i ; j++) {
                boolean value1 = false;
                // db에 있는 St, Fn의 값들 사이에 있으면 안되기 때문에 논리연산자로 적용
                value1 = (((dbSt < addSt && addSt < dbFn) || (dbSt < addFn && addFn < dbFn)) ||
                        // 2 < 3 && 3 < 4 → 논리합연산자로 인해 해당 값은 true
                        // 2 < 5 && 5 < 4 → 논리합연산자로 인해 해당 값은 false
                        // true || false → true 한개라도 해당 값이 true 가 나오면 입력한 시간과 db에 있는 시간이 겹치는 것임
                        ((addSt < dbSt && dbSt < addFn) || (addSt < dbFn && dbFn < addFn)));
                        // 3 < 2 && 2 < 5 → 논릴합연산자로 인해 해당 값은 false
                        // 3 < 4 && 4 < 5 → 논리합연산자로 인해 해당 값은 true
                        // false || true → true
                System.out.println(value1);

                // true || true → true 로 입력을 거부

                System.out.println(value);

                // 한 List만 확인하는게 아닌 계속 확인해야하니 value값을 계속 확인
                value = value || value1;

                System.out.println(value);
//            }
        }
        // true = 불가능, false = 가능
        return value;
    }

    // 입력한 과목명이 있는지 확인 (중복)
    @Override
    public boolean subjectFindName(List<SubjectClass> subjectClassList, SubjectClass subjectClass) {
        boolean value = false;

        for (int i = 0 ; i < subjectClassList.size() ; i++){
            boolean value1 = subjectClassList.get(i).getSubjectNm().contains(subjectClass.getSubjectNm());

            value = value || value1;
        }
        return value;
    }

    // 아이디로 시간표 검색
    @Override
    public List<SubjectClass> subjectListFind(String userid, String day) {
        List<SubjectClass> subjectClassList = subjectClassRepository.findByUseridAndDay(userid, day);
        return subjectClassList;
    }


}