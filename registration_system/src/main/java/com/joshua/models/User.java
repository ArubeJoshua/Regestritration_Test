package com.joshua.models;

import java.util.Date;
import java.util.Objects;

public class User {
    private String userName;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    //initializing the constructor
    public User(String userName, String firstName, String lastName, Date dob) {
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

    public Date getDob() {
        return dateOfBirth;
    }

    public void setDob(Date dob) {
        this.dateOfBirth = dob;
    }

    //Handling nulls
    @Override
    public String toString() {
        return "User Name: " + Objects.toString(userName, "Unknown") +
          ", First Name: " + Objects.toString(firstName, "Unknown") +
          ", Lat Name: " + Objects.toString(lastName, "Unknown") +
          ", Date of Birth: " + Objects.toString(dateOfBirth, "Unknown") + "\n";
    }

     // Overriding equals method
     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         User user = (User) o;
         return Objects.equals(userName, user.userName) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(dateOfBirth, user.dateOfBirth);
     }
 
     // Overriding hashCode method
     @Override
     public int hashCode() {
         return Objects.hash(userName, firstName, lastName, dateOfBirth);
     }
}

