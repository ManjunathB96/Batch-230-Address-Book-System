package com.addressbookmgmtsystem;

public class Contact {
    private String fName;
    private String lName;
    private String add;
    private String city;
    private String state;
    private int pinCode;
    private long phoneNum;
    private String email;

    public Contact(String fName, String lName, String add, String city, String state, int pinCode, long phoneNum, String email) {
        this.fName = fName;
        this.lName = lName;
        this.add = add;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.phoneNum = phoneNum;
        this.email = email;
    }

}
