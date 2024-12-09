package com.kh.practiceEx.dbPre;

import lombok.Getter;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {

    //String = emp_id && Employee = All Info
    public Map<String, Employee> employeeMap = new HashMap<String, Employee>();

    /**
     * 신규 직원정보 추가 기능 (모든 정보를 전달 받음, 단, ent_date, ent_yn은 null 적용 가능)
     * @param employee
     */
    @Override
    public void addEmployee(Employee employee) {
        // 추가할 사원 정보 put 저장, 사원등록을 할 떄마다
        // 몇 번째로 가입한 사원인지 자동으로 count를 진행
        // 사원 정보를 모두 저장
        employeeMap.put(employee.getEmp_id(), employee);

    }

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
    @Override
    public void updateEmployee(String emp_name, String email, String phone, String dept_code, String job_code, String sal_level, double salary, double bonus, String manager_id, Date ent_date, char ent_yn) {
        System.out.println("정보 저장하고자 하는 코드 작성");
    }

    /** set 이용해서 사원번호, 사원이름, 사원이메일, 퇴사여부로 초기화하고 일치하는 사원 삭제
     * 직원 삭제 기능 (사원번호, 사원이름, 사원이메일, 퇴사여부가 일치하는 사원만 정보 삭제하기)
     * @param emp_id     사원버호
     * @param emp_name  사원이름
     * @param email     사원이메일
     * @param ent_yn    퇴사여부
     */
    @Override
    public void deleteEmployee(String emp_id, String emp_name, String email, char ent_yn) {
        // Map에 등록되어 있는 사원들 중 id가 일치하는 사원
        Employee employee = employeeMap.get(emp_id);
        // 존재한다면
        if (employee != null) {
            // Map에서 삭제
            employeeMap.remove(emp_id);
            System.out.println(emp_id + "의 사원 정보를 제거했습니다. ");
            return;
        }
        System.out.println(emp_id + "와 일치하는 회원 정보를 찾을 수 없습니다.");
    }

    /**
     * 회원정보 조회 (emp_id, emp_name, email을 통해 사원 정보 조회)
     * @param emp_id
     * @param emp_name
     * @param email
     */
    @Override
    public void viewEmployee(String emp_id, String emp_name, String email) {
        Employee employee = employeeMap.get(emp_id);
        if (employee != null) {
            System.out.println(employee.toString());
            return;
        }
        System.out.println(emp_id + ", " + emp_name + ", " + email + "와 일치하는 정보가 없습니다.");
        System.out.println("확인하고 다시 조회해주세요.");
    }

    /**
     * 회원정보 조회 (emp_id, emp_name, email 중 하나라도 일치하면 사원 정보 조회) / 상위 직급을 위한 정보 조회
     * @param info_emp (emp_id, emp_name or email)
     */
    @Override
    public void viewEmployee(String info_emp) {
        Employee employee = employeeMap.get(info_emp);
        if (employee != null) {
            System.out.println(employee.toString());
            return;
        }
        System.out.println("일치하는 정보가 없습니다.");
        System.out.println("확인하고 다시 조회해주세요.");
    }

    /**
     * 회원정보 조회 (emp_name, email을 통해 사원 정보 조회) / 동명이인이 존재할 때 추가적인 정보 확인
     * @param emp_name
     * @param email
     */
    @Override
    public void viewEmployee(String emp_name, String email) {
        Employee employee = employeeMap.get(emp_name);
        if (employee != null) {
            System.out.println(employee.toString());
            return;
        }
        System.out.println("일치하는 사원 정보가 없습니다.");
    }

    /**
     * 로그인 (emp_name
     * @param emp_name
     * @param phone
     */
    @Override
    public void loginEmployee(String emp_name, String phone) {
        // 일치하는 정보가 존재하면 로그인이 완료되었습니다.
    }
}
