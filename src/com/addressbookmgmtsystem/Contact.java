package com.addressbookmgmtsystem;

public class Contact {
    private String fName;
    private  String mName;
    private String lName;
    private String add;
    private String city;
    private String state;
    private String country;
    private int pinCode;
    private long phoneNum;
    private String email;

    public Contact() {

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String fName, String mName,String lName, String add,
                   String city, String state,String country,
                   int pinCode, long phoneNum, String email) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.add = add;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
        this.phoneNum = phoneNum;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Contact{" + "FirstName='" + fName + '\'' + "MiddleName='" + fName + '\''+
                ", LastName='" + lName + '\'' + ", address='" + add +
                '\'' +"City='" + city + '\'' +"State='" + state + '\'' +"PinCode='" + pinCode +
                '\'' +"PhoneNumber='" + phoneNum+ '\'' +"Email Id ='" + email + '\'' + '}';
    }

}
