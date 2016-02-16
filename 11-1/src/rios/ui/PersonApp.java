package rios.ui;
import rios.business.Employee;
import rios.business.Customer;
import rios.business.Person;

/**
 * Created by eduardoriosjr on 2/16/16.
 */
public class PersonApp {

    // Properties

    // Constructor
    public void PersonApp(String type, String fName, String lName, String id, String email) {
        if (type.equalsIgnoreCase("e")) {
            Employee employee = new Employee();
            employee.setFirstName(fName);
            employee.setLastName(lName);
            employee.setSocial(id);
            employee.setEmailAddress(email);
        }

        else {
            Customer customer = new Customer();
        }
    }

    // Method
    public static String print(Person person) {

    }
}
