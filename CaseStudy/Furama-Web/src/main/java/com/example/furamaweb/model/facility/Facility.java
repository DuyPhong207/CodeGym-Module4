package com.example.furamaweb.model.facility;

import javax.persistence.*;

@Entity
@Table(name = "Facility")
public class Facility {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Area")
    private Integer area;

    @Column(name = "Cost")
    private Double cost;

    @Column(name = "Standard_Room")
    private String standardRoom;

    @Column(name = "Description_Other_Convenience")
    private String descriptionOtherConvenience;

    @Column(name = "Pool_Area")
    private Double poolArea;

    @Column(name = "Number_Of_Floor")
    private Integer numberOfFloor;

    @Column(name = "Facility_Free")
    private String facilityFree;

    @ManyToOne
    @JoinColumn(name = "Rent_Type_Id")
    private RentType rentType;

    @ManyToOne
    @JoinColumn(name = "Facility_Type_Id")
    private FacilityType facilityType;

    public Facility() {
    }

    public Facility(Integer id, String name, Integer area, Double cost, String standardRoom,
                    String descriptionOtherConvenience, Double poolArea, Integer numberOfFloor, String facilityFree,
                    RentType rentType, FacilityType facilityType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
        this.facilityFree = facilityFree;
        this.rentType = rentType;
        this.facilityType = facilityType;
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

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(Integer numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }
}
