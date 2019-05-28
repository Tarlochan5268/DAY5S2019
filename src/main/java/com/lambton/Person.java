package com.lambton;

import hardware.Computer;

import java.util.Date;

public class Person
{
    private int id;
    private String firstname;
    private String lastname;
    private char gender;
    private Date birthdate;
    private String email;
    private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    //blank constructor
    public Person() {
    }

    public Person(int id, String firstname, String lastname, char gender, Date birthdate, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.email = email;
    }
    public Person(int id, String firstname, String lastname, char gender, Date birthdate, String email,Computer computer) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.email = email;
        this.computer=computer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName()
    {
        return String.format(" %s %s ",this.firstname,this.lastname);
    }

    public void displayComputerDetails()
    {
        System.out.println(" Computer Id : "+computer.getId());
        System.out.println(" Company Name : "+computer.getCompanyname());
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", birthdate=" + birthdate +
                ", email='" + email + '\'' +
                '}';
    }
}
