package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Appointment {

    @Id
    @GeneratedValue()
    private long appointmentId;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @Column(nullable = false)
    private Date dateTime;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String status;

    protected Appointment() {

    }

    public Appointment(Client client, Date dateTime, String location, String status) {
        this.client = client;
        this.dateTime = dateTime;
        this.location = location;
        this.status = status;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
