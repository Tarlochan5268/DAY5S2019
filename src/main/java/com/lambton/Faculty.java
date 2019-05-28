package com.lambton;

import java.util.Date;

public class Faculty extends Person
{
    private String deptname;
    private String designation;
    private float salary;
    private Date joiningdate;

    public Faculty(String deptname, String designation, float salary, Date joiningdate) {
        this.deptname = deptname;
        this.designation = designation;
        this.salary = salary;
        this.joiningdate = joiningdate;
    }

    public Faculty(int id, String firstname, String lastname, char gender, Date birthdate, String email, String deptname, String designation, float salary, Date joiningdate) {
        super(id, firstname, lastname, gender, birthdate, email);
        this.deptname = deptname;
        this.designation = designation;
        this.salary = salary;
        this.joiningdate = joiningdate;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Date getJoiningdate() {
        return joiningdate;
    }

    public void setJoiningdate(Date joiningdate) {
        this.joiningdate = joiningdate;
    }
}
