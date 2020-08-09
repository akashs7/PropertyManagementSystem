package com.main1.main1.models;


import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "complaint")
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    @NonNull
    private String username;

    @Column(name = "property")
    @NonNull
    private String property;

    @Column(name = "problemtype")
    @NonNull
    private String problemType;

    @Column(name = "description")
    @NonNull
    private String description;

    @Column(name = "date")
    @NonNull
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

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

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
