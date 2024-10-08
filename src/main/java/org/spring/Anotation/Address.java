package org.spring.Anotation;

public class Address {
    int houseNo;
    String city;
    int pincode;

    public Address() {
        super();
    }

    public Address(int houseNo, String city, int pincode) {
        this.houseNo = houseNo;
        this.city = city;
        this.pincode = pincode;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
