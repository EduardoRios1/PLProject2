package rios.ui;
import com.sun.corba.se.spi.ior.IORTemplateList;
import rios.business.Employee;
import rios.business.Customer;
import rios.business.Person;
import rios.ui.Console;

/**
 * Created by eduardoriosjr on 2/16/16.
 */
public class PersonApp {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        String display = "y";
        Console.displayLine("Welcome to the Person Tester application");
        Console.displayLine();

        while (display.equals("y")){
            Console.displayLine();
            String input1 = Console.getString("Create customer or employee? (c/e): ");
            input1 = input1.trim();

            if (input1.equalsIgnoreCase("c") || input1.equalsIgnoreCase("e")) {

                // Ask for customer/employee redundant information
                Console.displayLine();
                String strFirstName = Console.getString("Enter first name: ");
                String strLastName = Console.getString("Enter last name: ");
                String strEmail = Console.getString("Enter email address: ");

                if (input1.equalsIgnoreCase("c")) {

                    String strCustNumber = Console.getString("Customer number: ");
                    Console.displayLine();

                    Customer person = new Customer(strFirstName, strLastName, strCustNumber, strEmail);

                    Console.displayLine();
                    Console.displayLine("You entered:");
                    Console.displayLine(person.getDisplayText());
                    Console.displayLine();

                } else {
                    String strSocial = Console.getString("Social Security Number: ");
                    Console.displayLine();

                    Employee person = new Employee(strFirstName, strLastName, strSocial, strEmail);

                    Console.displayLine();
                    Console.displayLine("You entered:");
                    Console.displayLine(person.getDisplayText());
                    Console.displayLine();
                }

            }

            else {
                Console.displayLine();
                Console.displayLine("Wrong input.  Please try again!");
                Console.displayLine();
            }

            display = Console.getString("Continue (y/n):");
            display = display.trim();
        }

    }
}
