package Reg_system;


public class User {
    private String userName;
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    //initializing the constructor
    public User(String userName, String firstName, String lastName, String dob) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dob;
    }

    //----------------------Getters and Setters----------------------//
    public String getUsername() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

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

    public String getDob() {
        return dateOfBirth;
    }

    public void setDob(String dob) {
        this.dateOfBirth = dob;
    }
}
