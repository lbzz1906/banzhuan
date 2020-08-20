package com.sys.pojo;

public class Customer {

    public Customer() {
    }

    public Customer(Integer usersId, String customerAddress) {
        this.usersId = usersId;
        this.customerAddress = customerAddress;
    }

    private Integer customerId;

    private Integer usersId;

    private String customerAddress;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", usersId=" + usersId +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}