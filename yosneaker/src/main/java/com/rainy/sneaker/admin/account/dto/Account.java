package com.rainy.sneaker.admin.account.dto;

import java.util.Date;

public class Account {
    private Integer accountId;

    private String accountName;

    private String accountUsername;

    private String accountRemark;

    private String accountQq;

    private String accountTelephone;

    private String accountEmail;

    private Integer accountSex;

    private String accountImages;

    private String accountArea;

    private String accountPassword;

    private String accountProvince;

    private String accountCity;

    private Integer accountCityId;

    private Integer accountProvinceId;

    private Date accountCreateTime;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountUsername() {
        return accountUsername;
    }

    public void setAccountUsername(String accountUsername) {
        this.accountUsername = accountUsername == null ? null : accountUsername.trim();
    }

    public String getAccountRemark() {
        return accountRemark;
    }

    public void setAccountRemark(String accountRemark) {
        this.accountRemark = accountRemark == null ? null : accountRemark.trim();
    }

    public String getAccountQq() {
        return accountQq;
    }

    public void setAccountQq(String accountQq) {
        this.accountQq = accountQq == null ? null : accountQq.trim();
    }

    public String getAccountTelephone() {
        return accountTelephone;
    }

    public void setAccountTelephone(String accountTelephone) {
        this.accountTelephone = accountTelephone == null ? null : accountTelephone.trim();
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail == null ? null : accountEmail.trim();
    }

    public Integer getAccountSex() {
        return accountSex;
    }

    public void setAccountSex(Integer accountSex) {
        this.accountSex = accountSex;
    }

    public String getAccountImages() {
        return accountImages;
    }

    public void setAccountImages(String accountImages) {
        this.accountImages = accountImages == null ? null : accountImages.trim();
    }

    public String getAccountArea() {
        return accountArea;
    }

    public void setAccountArea(String accountArea) {
        this.accountArea = accountArea == null ? null : accountArea.trim();
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword == null ? null : accountPassword.trim();
    }

    public String getAccountProvince() {
        return accountProvince;
    }

    public void setAccountProvince(String accountProvince) {
        this.accountProvince = accountProvince == null ? null : accountProvince.trim();
    }

    public String getAccountCity() {
        return accountCity;
    }

    public void setAccountCity(String accountCity) {
        this.accountCity = accountCity == null ? null : accountCity.trim();
    }

    public Integer getAccountCityId() {
        return accountCityId;
    }

    public void setAccountCityId(Integer accountCityId) {
        this.accountCityId = accountCityId;
    }

    public Integer getAccountProvinceId() {
        return accountProvinceId;
    }

    public void setAccountProvinceId(Integer accountProvinceId) {
        this.accountProvinceId = accountProvinceId;
    }

    public Date getAccountCreateTime() {
        return accountCreateTime;
    }

    public void setAccountCreateTime(Date accountCreateTime) {
        this.accountCreateTime = accountCreateTime;
    }
}