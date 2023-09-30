package com.bitspedia.oop.task5;
import com.bitspedia.task5.*;

public class Address {
    // streetAddress, town, city, country and phoneNumber
    private String streetAddress;
    private String town;
    private String city;
    private String country;
    private PhoneNumber phoneNumber;

    public Address(){}

    public Address(String streetAddress,String town,String city,String country){
        setStreetAddress(streetAddress);
        setTown(town);
        setCity(city);
        setCountry(country);
    }
    public Address(String streetAddress,String town,String city,String country,PhoneNumber phoneNumber){
        this(streetAddress,town,city,country);
        setPhoneNumber(phoneNumber);

    }

    public void setStreetAddress(String streetAddress){
        this.streetAddress = streetAddress;
    }
    public String getStreetAddress(){
        return streetAddress;
    }

    public void setTown(String town){
        this.town = town;
    }
    public String getTown(){
        return town;
    }

    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }

    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
