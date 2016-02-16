package rios.business;

/**
 * Created by eduardoriosjr on 2/16/16.
 */
public class Customer extends Person{

    // Properties
    public String id;

    // Constructor
    public void Customer(){}

    // Methods
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String getDisplayText() {
        return super.toString() + "\nCustomer Number: " + this.id;
    }
}
