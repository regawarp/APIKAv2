package com.arjuna.apika;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Regawa on 10/10/2018.
 */
public class Agenda {
    private int eventId;
    private String eventName;
    private Date eventDate;
    private String eventTime;
    private int eventQuota;
    private String eventLocation;
    private String eventFacility;
    private Date eventDueDate;
    private boolean eventFree;
    private double eventPrice;

    public Agenda(int eventId, String eventName, Date eventDate, String eventTime, int eventQuota, String eventLocation, String eventFacility, Date eventDueDate, boolean eventFree, double eventPrice) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventQuota = eventQuota;
        this.eventLocation = eventLocation;
        this.eventFacility = eventFacility;
        this.eventDueDate = eventDueDate;
        this.eventFree = eventFree;
        this.eventPrice = eventPrice;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public int getEventQuota() {
        return eventQuota;
    }

    public void setEventQuota(int eventQuota) {
        this.eventQuota = eventQuota;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventFacility() {
        return eventFacility;
    }

    public void setEventFacility(String eventFacility) {
        this.eventFacility = eventFacility;
    }

    public Date getEventDueDate() {
        return eventDueDate;
    }

    public void setEventDueDate(Date eventDueDate) {
        this.eventDueDate = eventDueDate;
    }

    public boolean isEventFree() {
        return eventFree;
    }

    public void setEventFree(boolean eventFree) {
        this.eventFree = eventFree;
    }

    public double getEventPrice() {
        return eventPrice;
    }

    public void setEventPrice(double eventPrice) {
        this.eventPrice = eventPrice;
    }
}
