package rios.business;

/**
 * Created by eduardoriosjr on 2/16/16.
 */
public class Employee extends Person {

    // Properties
    public String social;

    // Constructor
    public void Employee(){}

    // Methods
    public void setSocial(String social) {
        this.social = social;
    }

    public String getSocial() {
        return social;
    }

    @Override
    public String getDisplayText() {
        return super.toString() + "\nSocial Security Number: " + this.social;
    }


}
