package com.bridgelabz.addressbook;

public class AddressBook {
    private String firstName;
    private String lastName;
    private String email;
    private long phoneNumber,zip;
    private  String city, state, address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        //System.out.println("Welcome to Address Book program");
        AddressBook address=new AddressBook();
        address.setFirstName( "Virat");
        address.setLastName( "Kohli");
        address.setEmail( "virat@email.com");
        address.setState("Karnataka");
        address.setCity("Bengalore");
        address.setPhoneNumber(1234567890);
        address.setZip(123456);
        System.out.println("First name is :" +address.getFirstName());
        System.out.println("Last name is :" +address.getLastName());
        System.out.println("Email id is :" +address.getEmail());
        System.out.println("State name is :" +address.getState());
        System.out.println("City name is :" +address.getCity());
        System.out.println("Phone Number is :" +address.getPhoneNumber());
        System.out.println("Zip Number is :" +address.getZip());
    }
}
