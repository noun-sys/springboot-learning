package org.nounsys.nounservice.datasource.account.entity;

import java.util.Date;

public class User {
    private Long id;

    private String username;

    private String displayName;

    private String mobile;

    private String email;

    private String password;

    private String type;

    private String uid;

    private String status;

    private Long masterId;

    private Boolean isApiAccess;

    private Boolean isConsoleAccess;

    private Boolean isNeedVerify;

    private String description;

    private Date createdAt;

    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getMasterId() {
        return masterId;
    }

    public void setMasterId(Long masterId) {
        this.masterId = masterId;
    }

    public Boolean getIsApiAccess() {
        return isApiAccess;
    }

    public void setIsApiAccess(Boolean isApiAccess) {
        this.isApiAccess = isApiAccess;
    }

    public Boolean getIsConsoleAccess() {
        return isConsoleAccess;
    }

    public void setIsConsoleAccess(Boolean isConsoleAccess) {
        this.isConsoleAccess = isConsoleAccess;
    }

    public Boolean getIsNeedVerify() {
        return isNeedVerify;
    }

    public void setIsNeedVerify(Boolean isNeedVerify) {
        this.isNeedVerify = isNeedVerify;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}