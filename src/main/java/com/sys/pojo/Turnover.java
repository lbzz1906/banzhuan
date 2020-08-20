package com.sys.pojo;

public class Turnover {

    private Integer turnoverId;

    private Integer usersId;

    private Integer useUsersId;

    private Float turnoverMoney;

    private String turnoverPurpose;

    private Short turnoverType;

    private String turnoverTime;

    public Integer getTurnoverId() {
        return turnoverId;
    }

    public void setTurnoverId(Integer turnoverId) {
        this.turnoverId = turnoverId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getUseUsersId() {
        return useUsersId;
    }

    public void setUseUsersId(Integer useUsersId) {
        this.useUsersId = useUsersId;
    }

    public Float getTurnoverMoney() {
        return turnoverMoney;
    }

    public void setTurnoverMoney(Float turnoverMoney) {
        this.turnoverMoney = turnoverMoney;
    }

    public String getTurnoverPurpose() {
        return turnoverPurpose;
    }

    public void setTurnoverPurpose(String turnoverPurpose) {
        this.turnoverPurpose = turnoverPurpose;
    }

    public Short getTurnoverType() {
        return turnoverType;
    }

    public void setTurnoverType(Short turnoverType) {
        this.turnoverType = turnoverType;
    }

    public String getTurnoverTime() {
        return turnoverTime;
    }

    public void setTurnoverTime(String turnoverTime) {
        this.turnoverTime = turnoverTime;
    }
}