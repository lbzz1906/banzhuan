package com.sys.pojo;

public class Users {
    public Users() {
    }

    public Users(String usersName, String usersPassword) {
        this.usersName = usersName;
        this.usersPassword = usersPassword;
    }

    private Integer usersId;

    private String address;

    private String usersName;

    private String usersSex;

    private String usersPhone;

    private String usersEmail;

    private String usersPassword;

    private String usersHeadIcon;

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public String getUsersSex() {
        return usersSex;
    }

    public void setUsersSex(String usersSex) {
        this.usersSex = usersSex;
    }

    public String getUsersPhone() {
        return usersPhone;
    }

    public void setUsersPhone(String usersPhone) {
        this.usersPhone = usersPhone;
    }

    public String getUsersEmail() {
        return usersEmail;
    }

    public void setUsersEmail(String usersEmail) {
        this.usersEmail = usersEmail;
    }

    public String getUsersPassword() {
        return usersPassword;
    }

    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword;
    }

    public String getUsersHeadIcon() {
        return usersHeadIcon;
    }

    public void setUsersHeadIcon(String usersHeadIcon) {
        this.usersHeadIcon = usersHeadIcon;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }
}