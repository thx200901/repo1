package com.softeem.stargym.entity;

import java.util.Date;

public class Recharge {
    private Integer id;

    private String rechargeQq;

    private String rechargeName;

    private Date rechargeTime;

    private Double rechargeMoney;

    private String doName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRechargeQq() {
        return rechargeQq;
    }

    public void setRechargeQq(String rechargeQq) {
        this.rechargeQq = rechargeQq == null ? null : rechargeQq.trim();
    }

    public String getRechargeName() {
        return rechargeName;
    }

    public void setRechargeName(String rechargeName) {
        this.rechargeName = rechargeName == null ? null : rechargeName.trim();
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public Double getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(Double rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    public String getDoName() {
        return doName;
    }

    public void setDoName(String doName) {
        this.doName = doName == null ? null : doName.trim();
    }
}