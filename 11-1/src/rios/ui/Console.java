package rios.ui;
import java.util.Scanner;

/**
 * Created by eduardoriosjr on 2/16/16.
 */
public class Console {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        String display = "y";
        System.out.println("Welcome to the Person Tester application");
        System.out.println();

        while (display.equals("y")){
            System.out.println();
            System.out.println("Create customer or employee? (c/e): ");
            Scanner scanner = new Scanner(System.in);
            String input1 = scanner.nextLine();
            input1 = input1.trim();

            if (input1.equalsIgnoreCase("c") || input1.equalsIgnoreCase("e")) {

                // Ask for customer/employee redundant information
                System.out.println();
                System.out.println("Enter first name: ");
                String strFirstName = scanner.nextLine();
                System.out.println("Enter last name: ");
                String strLastName = scanner.nextLine();
                System.out.println("Enter email address: ");
                String strEmail = scanner.nextLine();

                if (input1.equalsIgnoreCase("e")) {

                    System.out.println("Customer number: ");
                    String strSocial= scanner.nextLine();
                    System.out.println();

                    PersonApp application = new PersonApp(input1, strFirstName, strLastName, strSocial, strEmail);

                } else {
                    System.out.println("Social Security Number: ");
                    String strCustNumber = scanner.nextLine();
                    System.out.println();
                }

            }

            else {
                System.out.println();
                System.out.println("Wrong input.  Please try again!");
                System.out.println();
            }

            System.out.println("Display another customer (y/n):");
            display = scanner.next();
            display = display.trim();
        }

    }

}
