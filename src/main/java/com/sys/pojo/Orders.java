package com.sys.pojo;

public class Orders {

    private Integer ordersId;

    private String goodsName;

    private String ordersEntryTime;

    private String ordersPaymentTime;

    private String ordersDeliveryTime;

    private String ordersReceivingTime;

    private String ordersCancelTime;

    private String ordersReturnGoodsStartTime;

    private String ordersReturnGoodsEndTime;

    private String ordersEndTime;

    private Float ordersTotalMoney;

    private String ordersConsigneeName;

    private String ordersConsigneeAddress;

    private String ordersConsigneePhone;

    private String ordersStatus;

    private String ordersCourierNumber;

    private String shopsName;

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public String getOrdersEntryTime() {
        return ordersEntryTime;
    }

    public void setOrdersEntryTime(String ordersEntryTime) {
        this.ordersEntryTime = ordersEntryTime;
    }

    public String getOrdersPaymentTime() {
        return ordersPaymentTime;
    }

    public void setOrdersPaymentTime(String ordersPaymentTime) {
        this.ordersPaymentTime = ordersPaymentTime;
    }

    public String getOrdersDeliveryTime() {
        return ordersDeliveryTime;
    }

    public void setOrdersDeliveryTime(String ordersDeliveryTime) {
        this.ordersDeliveryTime = ordersDeliveryTime;
    }

    public String getOrdersReceivingTime() {
        return ordersReceivingTime;
    }

    public void setOrdersReceivingTime(String ordersReceivingTime) {
        this.ordersReceivingTime = ordersReceivingTime;
    }

    public String getOrdersCancelTime() {
        return ordersCancelTime;
    }

    public void setOrdersCancelTime(String ordersCancelTime) {
        this.ordersCancelTime = ordersCancelTime;
    }

    public String getOrdersReturnGoodsStartTime() {
        return ordersReturnGoodsStartTime;
    }

    public void setOrdersReturnGoodsStartTime(String ordersReturnGoodsStartTime) {
        this.ordersReturnGoodsStartTime = ordersReturnGoodsStartTime;
    }

    public String getOrdersReturnGoodsEndTime() {
        return ordersReturnGoodsEndTime;
    }

    public void setOrdersReturnGoodsEndTime(String ordersReturnGoodsEndTime) {
        this.ordersReturnGoodsEndTime = ordersReturnGoodsEndTime;
    }

    public String getOrdersEndTime() {
        return ordersEndTime;
    }

    public void setOrdersEndTime(String ordersEndTime) {
        this.ordersEndTime = ordersEndTime;
    }

    public Float getOrdersTotalMoney() {
        return ordersTotalMoney;
    }

    public void setOrdersTotalMoney(Float ordersTotalMoney) {
        this.ordersTotalMoney = ordersTotalMoney;
    }

    public String getOrdersConsigneeName() {
        return ordersConsigneeName;
    }

    public void setOrdersConsigneeName(String ordersConsigneeName) {
        this.ordersConsigneeName = ordersConsigneeName;
    }

    public String getOrdersConsigneeAddress() {
        return ordersConsigneeAddress;
    }

    public void setOrdersConsigneeAddress(String ordersConsigneeAddress) {
        this.ordersConsigneeAddress = ordersConsigneeAddress;
    }

    public String getOrdersConsigneePhone() {
        return ordersConsigneePhone;
    }

    public void setOrdersConsigneePhone(String ordersConsigneePhone) {
        this.ordersConsigneePhone = ordersConsigneePhone;
    }

    public String getOrdersStatus() {
        return ordersStatus;
    }

    public void setOrdersStatus(String ordersStatus) {
        this.ordersStatus = ordersStatus;
    }

    public String getOrdersCourierNumber() {
        return ordersCourierNumber;
    }

    public void setOrdersCourierNumber(String ordersCourierNumber) {
        this.ordersCourierNumber = ordersCourierNumber;
    }

    public String getShopsName() {
        return shopsName;
    }

    public void setShopsName(String shopsName) {
        this.shopsName = shopsName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "ordersId=" + ordersId +
                ", ordersEntryTime='" + ordersEntryTime + '\'' +
                ", ordersTotalMoney=" + ordersTotalMoney +
                ", ordersConsigneeName='" + ordersConsigneeName + '\'' +
                ", ordersConsigneeAddress='" + ordersConsigneeAddress + '\'' +
                ", ordersConsigneePhone='" + ordersConsigneePhone + '\'' +
                ", ordersStatus='" + ordersStatus + '\'' +
                ", ordersCourierNumber='" + ordersCourierNumber + '\'' +
                ", shopsName='" + shopsName + '\'' +
                ", goodsName='" + goodsName + '\'' +
                '}';
    }
}