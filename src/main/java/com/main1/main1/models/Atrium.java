package com.main1.main1.models;


import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "atrium")
public class Atrium {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "zone")
    @NonNull
    private String Zone;

    @Column(name = "daytype")
    @NonNull
    private String dayType;

    @Column(name="renttype")
    @NonNull
    private String rentType;

    @Column(name="rent")
    @NonNull
    private double rent;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getZone() {
        return Zone;
    }

    public void setZone(String zone) {
        Zone = zone;
    }

    public String getDayType() {
        return dayType;
    }

    public void setDayType(String dayType) {
        this.dayType = dayType;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
}
