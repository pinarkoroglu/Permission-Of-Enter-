package com.permission.permission.Model;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.Clock;
import java.util.Date;

@Entity
@Table(name="jobsecuritytraining")
public class JobSecurityTraining {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer jobSecurityTrainingID;
    @Column(name="loginstartdate")
    private Date loginStartDate;
    @Column(name="loginenddate")
    private Date loginEndDate;
    @Column(name="loginstarttime")
    private Date loginStartTime;
    @Column(name="loginendtime")
    private Date loginEndTime;
    @Column(name="authorized")
    private String authorized;
    @Column(name="confirmation")
    private Boolean confirmation;

    public Integer getJobSecurityTrainingID() {
        return jobSecurityTrainingID;
    }

    public void setJobSecurityTrainingID(Integer jobSecurityTrainingID) {
        this.jobSecurityTrainingID = jobSecurityTrainingID;
    }

    public Date getLoginStartDate() {
        return loginStartDate;
    }

    public void setLoginStartDate(Date loginStartDate) {
        this.loginStartDate = loginStartDate;
    }

    public Date getLoginEndDate() {
        return loginEndDate;
    }

    public void setLoginEndDate(Date loginEndDate) {
        this.loginEndDate = loginEndDate;
    }

    public Date getLoginStartTime() {
        return loginStartTime;
    }

    public void setLoginStartTime(Date loginStartTime) {
        this.loginStartTime = loginStartTime;
    }

    public Date getLoginEndTime() {
        return loginEndTime;
    }

    public void setLoginEndTime(Date loginEndTime) {
        this.loginEndTime = loginEndTime;
    }

    public String getAuthorized() {
        return authorized;
    }

    public void setAuthorized(String authorized) {
        this.authorized = authorized;
    }

    public Boolean getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(Boolean confirmation) {
        this.confirmation = confirmation;
    }
}
