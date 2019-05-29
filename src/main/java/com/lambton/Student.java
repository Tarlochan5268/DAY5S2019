package com.lambton;

import Interface.InheritanceExample;
import hardware.Computer;

import java.util.Arrays;
import java.util.Date;

public class Student extends Person implements InheritanceExample
{
    private float []marks;
    private float total;
    private float per;
    private String result;
    private String coursename;

    public Student(){}

    public Student(float[] marks, float total, float per, String result,String coursename) {
        this.marks = marks;
        this.total = total;
        this.per = per;
        this.result = result;
        this.coursename=coursename;
    }

    public Student(int id, String firstname, String lastname, char gender, Date birthdate, String email,
                   float[] marks, float total, float per, String result,String coursename) {
        super(id, firstname, lastname, gender, birthdate, email);
        this.marks = marks;
        this.total = total;
        this.per = per;
        this.result = result;
        this.coursename=coursename;
    }
    public Student(int id, String firstname, String lastname, char gender, Date birthdate, String email,
                   float[] marks,String coursename) {
        super(id, firstname, lastname, gender, birthdate, email);
        this.marks = marks;
        this.coursename=coursename;
    }
    public Student(int id, String firstname, String lastname, char gender, Date birthdate, String email,Computer computer,
                   float[] marks,String coursename) {
        super(id, firstname, lastname, gender, birthdate, email,computer);
        this.marks = marks;
        this.coursename=coursename;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getTotal() {
        return total;
    }
    public float getPer() {
        return per;
    }
    public String getResult() {
        return result;
    }
    @Override
    public String toString() {
        return "Student{" +
                "marks=" + Arrays.toString(marks) +
                ", total=" + total +
                ", per=" + per +
                ", result='" + result + '\'' +
                ", coursename='" + coursename + '\'' +
                '}';
    }

    public void calculateTotal()
    {
        this.total=0.0f;
        for(float mark:marks)
        {
            this.total+=mark;
        }
    }

    public  void calculatePer()
    {
        this.per=this.total/this.marks.length;
    }
    public void calculateResult()
    {
        int passCount=0;
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]>50.0f)
            {
                passCount++;
            }
        }
        if(passCount<=2)
        {
            this.result="F";
        }
        else
        {
            if(this.per>=94.0f)
            {
                this.result="A+";
            }
            else if(this.per>=87.0f)
            {
                this.result="A";
            }
            else if(this.per>=80.0f)
            {
                this.result="A-";
            }
            else if(this.per>=77.0f)
            {
                this.result="B+";
            }
            else if(this.per>=73.0f)
            {
                this.result="B";
            }
            else if(this.per>=70.0f)
            {
                this.result="B-";
            }
            else if(this.per>=67.0f)
            {
                this.result="C+";
            }
            else if(this.per>=63.0f)
            {
                this.result="C";
            }
            else if(this.per>=60.0f)
            {
                this.result="C-";
            }
            else if(this.per>=50.0f)
            {
                this.result="D";
            }
            else
            {
                this.result="F";
            }
        }
    }

    public void displayStudentInfo()
    {
        System.out.println("--------------------------------------------------");
        System.out.println("--------------- Student Information  -------------");
        System.out.println("--------------------------------------------------");

        System.out.println(" Student ID : "+getId());
        System.out.println(" Full Name : "+getFullName());
        System.out.println(" Gender : "+getGender());
        System.out.println(" Course : "+getCoursename());
        System.out.println(" Birth Date : "+getBirthdate());
        System.out.println(" Email : "+getEmail());
        super.displayComputerDetails();
        int i=1;
        for(float mark:getMarks())
        {
            System.out.println(" Subject ["+i+"] : "+mark);
            i++;
        }
        System.out.println(" Total Marks : "+getTotal());
        System.out.println(" Percentage : "+getPer());
        System.out.println(" Result : "+getResult());

        System.out.println("--------------------------------------------------");

    }

    @Override
    public void display() {
        System.out.println("--------------------------------------------------");
        System.out.println("--------------- Student Information  -------------");
        System.out.println("--------------------------------------------------");

        System.out.println(" Student ID : "+getId());
        System.out.println(" Full Name : "+getFullName());
        System.out.println(" Gender : "+getGender());
        System.out.println(" Course : "+getCoursename());
        System.out.println(" Birth Date : "+getBirthdate());
        System.out.println(" Email : "+getEmail());
        super.displayComputerDetails();
        int i=1;
        for(float mark:getMarks())
        {
            System.out.println(" Subject ["+i+"] : "+mark);
            i++;
        }
        System.out.println(" Total Marks : "+getTotal());
        System.out.println(" Percentage : "+getPer());
        System.out.println(" Result : "+getResult());

        System.out.println("--------------------------------------------------");

    }
}
