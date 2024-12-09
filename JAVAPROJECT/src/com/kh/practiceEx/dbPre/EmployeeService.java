package com.kh.practiceEx.dbPre;

import java.util.Date;

public interface EmployeeService {

    /**
     * 신규 직원정보 추가 기능 (모든 정보를 전달 받음, 단, ent_date, ent_yn은 null 적용 가능)
     * @param employee
     */
    void addEmployee(Employee employee);

    /** 부분 매개변수 전달 생성자 생성 후 정보 수정한 내용을 DB에 전달 to emp_id가 일치한 사원 정보 update
     * 직원 정보 수정 기능 (emp_id, emp_no, hire_date 수정 불가)
     * @param emp_name
     * @param email
     * @param phone
     * @param dept_code
     * @param job_code
     * @param sal_level
     * @param salary
     * @param bonus
     * @param manager_id
     * @param ent_date
     * @param ent_yn
     */
    void updateEmployee(String emp_name, String email, String phone, String dept_code, String job_code, String sal_level, double salary, double bonus, String manager_id, Date ent_date, char ent_yn);

    /** set 이용해서 사원번호, 사원이름, 사원이메일, 퇴사여부로 초기화하고 일치하는 사원 삭제
     * 직원 삭제 기능 (사원번호, 사원이름, 사원이메일, 퇴사여부가 일치하는 사원만 정보 삭제하기)
     * @param emp_id     사원버호
     * @param emp_name  사원이름
     * @param email     사원이메일
     * @param ent_yn    퇴사여부
     */
    void deleteEmployee(String emp_id, String emp_name, String email, char ent_yn);

    /**
     * 회원정보 조회 (emp_id, emp_name, email을 통해 사원 정보 조회)
     * @param em_id
     * @param emp_name
     * @param email
     */
    void viewEmployee(String em_id, String emp_name, String email);

    /**
     * 회원정보 조회 (emp_id, emp_name, email 중 하나라도 일치하면 사원 정보 조회) / 상위 직급을 위한 정보 조회
     * @param info_emp (emp_id, emp_name or email)
     */
    void viewEmployee(String info_emp);

    /**
     * 회원정보 조회 (emp_name, email을 통해 사원 정보 조회) / 동명이인이 존재할 때 추가적인 정보 확인
     * @param emp_name
     * @param email
     */
    void viewEmployee(String emp_name, String email);

    /**
     * 로그인 (emp_name, phone을 통해 로그인)
     * @param emp_name
     * @param phone
     */
    void loginEmployee(String emp_name, String phone);

}
