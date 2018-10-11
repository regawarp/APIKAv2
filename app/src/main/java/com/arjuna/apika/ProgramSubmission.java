package com.arjuna.apika;

import java.util.Date;

/**
 * Created by Regawa on 10/11/2018.
 */

public class ProgramSubmission {
    private int progSubId;
    private String progSubName;
    private double progSubNominal;
    private String progSubNote;
    private String progSubAttach;
    private Date progSubDate;

    public ProgramSubmission(int progSubId, String progSubName, double progSubNominal, Date progSubDate) {
        this.progSubId = progSubId;
        this.progSubName = progSubName;
        this.progSubNominal = progSubNominal;
        this.progSubDate = progSubDate;
    }

    public int getProgSubId() {
        return progSubId;
    }

    public void setProgSubId(int progSubId) {
        this.progSubId = progSubId;
    }

    public String getProgSubName() {
        return progSubName;
    }

    public void setProgSubName(String progSubName) {
        this.progSubName = progSubName;
    }

    public double getProgSubNominal() {
        return progSubNominal;
    }

    public void setProgSubNominal(double progSubNominal) {
        this.progSubNominal = progSubNominal;
    }

    public String getProgSubNote() {
        return progSubNote;
    }

    public void setProgSubNote(String progSubNote) {
        this.progSubNote = progSubNote;
    }

    public String getProgSubAttach() {
        return progSubAttach;
    }

    public void setProgSubAttach(String progSubAttach) {
        this.progSubAttach = progSubAttach;
    }

    public Date getProgSubDate() {
        return progSubDate;
    }

    public void setProgSubDate(Date progSubDate) {
        this.progSubDate = progSubDate;
    }
}
