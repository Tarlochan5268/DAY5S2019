package com.lambton;

import hardware.Computer;

import java.util.Date;

public class MainClass
{
    public static void main(String[] args)
    {
        Computer computer=new Computer(5268,"ASUS");
        float marks[]={90,50,60,90,10};
        Date birth=new Date(1995,6,11);
        Date join=new Date(2018,4,5);
        Student student=new Student(751142,"Das TarlochanPreet","Singh",'M',birth,"brotherstarlochan5268@gmail.com",computer,
                marks,"MADT");
        Student.COUNT++;
        student.COUNT++;
        System.out.println("COUNT : "+Student.COUNT); //2
        student.calculateTotal();
        student.calculatePer();
        student.calculateResult();
        student.display();
        Faculty faculty=new Faculty(5268,"TarlochanPreet","Singh",'M',birth,"tarlochan5268@gmail.com",computer,"MADT"
                ,"Instructor",10000,join);
        faculty.display();
    }
}
