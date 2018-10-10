package com.arjuna.apika;

import java.util.Date;

/**
 * Created by Regawa on 10/10/2018.
 */

public class Proyek {
    private int projectId;
    private String projectName;
    private String projectQualification;
    private double projectPrice;
    private String projectLocation;
    private Date projectDueBid;
    private Date projectStart;
    private Date projectFinish;
    private int projectWinner;

    public Proyek(int projectId, String projectName, String projectQualification, double projectPrice, String projectLocation, Date projectDueBid, Date projectStart, Date projectFinish, int projectWinner) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectQualification = projectQualification;
        this.projectPrice = projectPrice;
        this.projectLocation = projectLocation;
        this.projectDueBid = projectDueBid;
        this.projectStart = projectStart;
        this.projectFinish = projectFinish;
        this.projectWinner = projectWinner;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectQualification() {
        return projectQualification;
    }

    public void setProjectQualification(String projectQualification) {
        this.projectQualification = projectQualification;
    }

    public double getProjectPrice() {
        return projectPrice;
    }

    public void setProjectPrice(double projectPrice) {
        this.projectPrice = projectPrice;
    }

    public String getProjectLocation() {
        return projectLocation;
    }

    public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }

    public Date getProjectDueBid() {
        return projectDueBid;
    }

    public void setProjectDueBid(Date projectDueBid) {
        this.projectDueBid = projectDueBid;
    }

    public Date getProjectStart() {
        return projectStart;
    }

    public void setProjectStart(Date projectStart) {
        this.projectStart = projectStart;
    }

    public Date getProjectFinish() {
        return projectFinish;
    }

    public void setProjectFinish(Date projectFinish) {
        this.projectFinish = projectFinish;
    }

    public int getProjectWinner() {
        return projectWinner;
    }

    public void setProjectWinner(int projectWinner) {
        this.projectWinner = projectWinner;
    }
}
