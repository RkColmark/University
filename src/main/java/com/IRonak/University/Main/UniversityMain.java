package com.IRonak.University.Main;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="University")
public class UniversityMain {

    public UniversityMain()
    {

    }

 /*   public UniversityMain(int id, String fname, String lname, String email, String gender, String courses) {
        Id = id;
        firstname = fname;
        Lastname = lname;
        Email = email;
        Gender = gender;
        Courses = courses; }*/


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    private int Id;

    @Column(name="First_name")
    private String firstName;

    @Column(name = "Last_name")
    private String lastName;

    @Column(name = "Email")
    private String email;

    @Column(name = "Gender")
    private String gender;

    @Column(name ="Courses")
    private String courses;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }






    @Override
    public String toString() {
        return "UniversityMain{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +

                '}';
    }

}

