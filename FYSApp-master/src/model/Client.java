package model;

import static main.FYSApp.*;

/**
 * @author Team 1 IS106 ZoekJeKoffer
 *
 */
public class Client {

    private String firstName = NO_VALUE;
    private String middleName = NO_VALUE;
    private String lastName = NO_VALUE;
    private String phone = NO_VALUE;
    private String email = NO_VALUE;
    private String country = NO_VALUE;
    private String address = NO_VALUE;
    private String city = NO_VALUE;
    private String state = NO_VALUE;
    private String zipCode = NO_VALUE;

    public Client() {
    }

    public Client(String firstName, String middleName, String lastName,
            String phone, String email, String country, String address,
            String city, String state, String zipCode) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.country = country;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
