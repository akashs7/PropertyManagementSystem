package com.main1.main1.models;


import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "bookings")
public class Bookings {

    @Id
    @NonNull
    private long id;

    @Column(name="username")
    @NonNull
    private String username;

    @Column(name = "property")
    @NonNull
    private String property;

    @Column(name = "startday")
    @NonNull
    private java.sql.Date startday;

    @Column(name = "endday")
    @NonNull
    private java.sql.Date endday;

    @Column(name = "rent")
    @NonNull
    private double rent;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public Date getStartday() {
        return startday;
    }

    public void setStartday(Date startday) {
        this.startday = startday;
    }

    public Date getEndday() {
        return endday;
    }

    public void setEndday(Date endday) {
        this.endday = endday;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
}
