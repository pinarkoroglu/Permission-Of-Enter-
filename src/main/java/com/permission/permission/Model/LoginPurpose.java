package com.permission.permission.Model;

import javax.persistence.*;

@Entity
@Table(name="loginpurpose")
public class LoginPurpose {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="loginPurposeID")
    private Integer loginPurposeID;
    @Column(name="loginPurposeName")
    private String loginPurposeName;

    public Integer getLoginPurposeID() {
        return loginPurposeID;
    }

    public void setLoginPurposeID(Integer loginPurposeID) {
        this.loginPurposeID = loginPurposeID;
    }

    public String getLoginPurposeName() {
        return loginPurposeName;
    }

    public void setLoginPurposeName(String loginPurposeName) {
        this.loginPurposeName = loginPurposeName;
    }
}
