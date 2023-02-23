package com.example.furamaweb.model.employee;

import com.example.furamaweb.model.login.AppUser;
import com.fasterxml.jackson.databind.DatabindException;
import com.sun.tools.javac.jvm.Gen;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @Column(name = "Id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Date_Of_Birth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "Id_Card", nullable = false)
    private String idCard;

    @Column(name = "Salary", nullable = false)
    private Double salary;

    @Column(name = "Phone_Number", nullable = false)
    private String phoneNumber;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "Address", nullable = false)
    private String address;

    @ManyToOne
    @JoinColumn(name = "Position_Id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "Education_Degree_Id")
    private EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn(name = "Division_Id")
    private Division division;

    @OneToOne
    @JoinColumn(name = "User_Name")
    private AppUser appUser;

    public Employee() {
    }

    public Employee(Integer id, String name, Date dateOfBirth, String idCard, Double salary, String phoneNumber,
                    String email, String address, Position position, EducationDegree educationDegree, Division division,
                    AppUser appUser) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idCard = idCard;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
        this.appUser = appUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }
}
