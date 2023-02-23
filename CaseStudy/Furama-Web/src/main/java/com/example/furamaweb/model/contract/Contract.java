package com.example.furamaweb.model.contract;

import com.example.furamaweb.model.customer.Customer;
import com.example.furamaweb.model.employee.Employee;
import com.example.furamaweb.model.facility.Facility;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private String id;

    @Column(name = "Start_Date")
    private Date startDate;

    @Column(name = "End_Date")
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "Employee_Id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "Customer_Id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "Facility_Id")
    private Facility facility;

    public Contract() {
    }

    public Contract(String id, Date startDate, Date endDate, Employee employee, Customer customer, Facility facility) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }
}
