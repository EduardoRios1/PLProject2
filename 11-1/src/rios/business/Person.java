package rios.business;

/**
 * Created by eduardoriosjr on 2/16/16.
 */
abstract public class Person {

    // Abstract constructor
    public void Person(){}

    // Properties
    public String firstName;
    public String lastName;
    public String emailAddress;

    // Methods

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nEmail: " + emailAddress;
    }

    // Abstract method
    abstract String getDisplayText();

}

