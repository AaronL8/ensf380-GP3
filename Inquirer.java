package edu.ucalgary.oop;

public class Inquirer {
    private String firstName;
    private String lastName;
    private String servicesPhone;
    private String info;

    // Constructor
    public Inquirer(String firstName, String lastName, String phone, String info) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.servicesPhone = phone;
        this.info = info;
    }

    // Getter method for first name
    public String getFirstName() {
        return firstName;
    }

    // Getter method for last name
    public String getLastName() {
        return lastName;
    }

    // Getter method for services phone number
    public String getServicesPhoneNum() {
        return servicesPhone;
    }

    // Getter method for info
    public String getInfo() {
        return info;
    }
}