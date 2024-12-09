package com.kh.practiceEx.dbPre;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Employee {
    // 추후 DB 컬럼명과 연결할 자바 변수명으로 DB와 자바변수명과 일치시켜주는 것이 좋음.
    // BYTE 크기를 제한 걸 때 length, size()로 조정할 수 있다.

    private String emp_id;// EMP_ID	VARCHAR2(3 BYTE)
    private String emp_name;//    EMP_NAME	VARCHAR2(20 BYTE)
    private String emp_no;//    EMP_NO	CHAR(14 BYTE)
    private String email;//    EMAIL	VARCHAR2(25 BYTE)
    private String phone;//    PHONE	VARCHAR2(12 BYTE)
    private String dept_code;//    DEPT_CODE	CHAR(2 BYTE)
    private String job_code;//    JOB_CODE	CHAR(2 BYTE)
    private String sal_level;//    SAL_LEVEL	CHAR(2 BYTE)
    private double salary;//    SALARY	NUMBER
    private double bonus;//    BONUS	NUMBER
    private String manager_id;//    MANAGER_ID	VARCHAR2(3 BYTE)
    private Date hire_date;//    HIRE_DATE	DATE
    private Date ent_date;//    ENT_DATE	DATE
    private char ent_yn;//    ENT_YN	CHAR(1 BYTE)

    public String getEmp_id() {
        return emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getEmp_no() {
        return emp_no;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDept_code() {
        return dept_code;
    }

    public String getJob_code() {
        return job_code;
    }

    public String getSal_level() {
        return sal_level;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public String getManager_id() {
        return manager_id;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public Date getEnt_date() {
        return ent_date;
    }

    public char getEnt_yn() {
        return ent_yn;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id='" + emp_id + '\'' +
                ", emp_name='" + emp_name + '\'' +
                ", emp_no='" + emp_no + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", dept_code='" + dept_code + '\'' +
                ", job_code='" + job_code + '\'' +
                ", sal_level='" + sal_level + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", manager_id='" + manager_id + '\'' +
                ", hire_date=" + hire_date +
                ", ent_date=" + ent_date +
                ", ent_yn=" + ent_yn +
                '}';
    }
}
