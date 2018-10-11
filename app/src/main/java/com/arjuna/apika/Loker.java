package com.arjuna.apika;

import java.util.Date;

/**
 * Created by Regawa on 10/11/2018.
 */

public class Loker {
    private int lokerId;
    private String lokerPosition;
    private String lokerCompany;
    private int lokerQuota;
    private Date lokerDue;
    private String lokerQualification;
    private String lokerBenefit;
    private String lokerNotes;
    private String lokerTlp;
    private String lokerWa;
    private String lokerEmail;

    public Loker(int lokerId, String lokerCompany, String lokerPosition, Date lokerDue, int lokerQuota) {
        this.lokerId = lokerId;
        this.lokerCompany = lokerCompany;
        this.lokerPosition = lokerPosition;
        this.lokerDue = lokerDue;
        this.lokerQuota = lokerQuota;
    }

    public int getLokerId() {
        return lokerId;
    }

    public void setLokerId(int lokerId) {
        this.lokerId = lokerId;
    }

    public String getLokerPosition() {
        return lokerPosition;
    }

    public void setLokerPosition(String lokerPosition) {
        this.lokerPosition = lokerPosition;
    }

    public String getLokerCompany() {
        return lokerCompany;
    }

    public void setLokerCompany(String lokerCompany) {
        this.lokerCompany = lokerCompany;
    }

    public int getLokerQuota() {
        return lokerQuota;
    }

    public void setLokerQuota(int lokerQuota) {
        this.lokerQuota = lokerQuota;
    }

    public Date getLokerDue() {
        return lokerDue;
    }

    public void setLokerDue(Date lokerDue) {
        this.lokerDue = lokerDue;
    }

    public String getLokerQualification() {
        return lokerQualification;
    }

    public void setLokerQualification(String lokerQualification) {
        this.lokerQualification = lokerQualification;
    }

    public String getLokerBenefit() {
        return lokerBenefit;
    }

    public void setLokerBenefit(String lokerBenefit) {
        this.lokerBenefit = lokerBenefit;
    }

    public String getLokerNotes() {
        return lokerNotes;
    }

    public void setLokerNotes(String lokerNotes) {
        this.lokerNotes = lokerNotes;
    }

    public String getLokerTlp() {
        return lokerTlp;
    }

    public void setLokerTlp(String lokerTlp) {
        this.lokerTlp = lokerTlp;
    }

    public String getLokerWa() {
        return lokerWa;
    }

    public void setLokerWa(String lokerWa) {
        this.lokerWa = lokerWa;
    }

    public String getLokerEmail() {
        return lokerEmail;
    }

    public void setLokerEmail(String lokerEmail) {
        this.lokerEmail = lokerEmail;
    }
}
