package model;

import static main.FYSApp.NO_VALUE;

/**
 *
 * @author Team 1 IS106 ZoekJeKoffer
 */
public class User {

    private String userName = NO_VALUE;
    private String pass = NO_VALUE;
    private String role = NO_VALUE;
    private String firstName = NO_VALUE;
    private String middleName = NO_VALUE;
    private String lastName = NO_VALUE;
    private String email = NO_VALUE;
    private String airport = NO_VALUE;

    public User() {

    }

    /**
     *
     * @param userName
     * @param pass
     * @param role
     * @param firstName
     * @param middleName
     * @param lastName
     * @param email
     * @param airport
     */
    public User(String userName, String pass, String role,
            String firstName, String middleName, String lastName,
            String email, String airport) {

        this.userName = userName;
        this.pass = pass;
        this.role = role;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.airport = airport;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }
}
