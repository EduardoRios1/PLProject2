package rios.ui;
import rios.ui.Console;
import rios.business.CheckingAccount;
import rios.business.Transactions;

/**
 * Created by eduardoriosjr on 2/19/16.
 */
public class AccountApp {
    public static void main(String[] args) {
        String display = "y";
        Console.displayLine("Welcome to the Account Calculator!");
        Console.displayLine();

        CheckingAccount account = new CheckingAccount();
        Console.displayLine("Starting Balance");
        Console.displayLine("Checking: " + account.getBalanceFormatted());

        Console.displayLine();
        Console.displayLine("Enter the transactions for the month");
        Console.displayLine();

        while (display.equals("y")) {
            String input1 = Console.getString("Withdrawal or deposit? (w/d): ");
            input1 = input1.trim();

            if(input1.equalsIgnoreCase("w")) {

                String strAmt = Console.getString("Amount: ");
                double amt = Double.parseDouble(strAmt);

                if (amt > account.getBalance()) {
                    Console.displayLine("Insufficient Funds!!!");
                } else {
                    Transactions.withdraw(account, amt);
                }
            }

            else if(input1.equalsIgnoreCase("d")) {
                String strAmt = Console.getString("Amount: ");
                double amt = Double.parseDouble(strAmt);

                if (amt > 10000) {
                    Console.displayLine("CANNOT DEPOSIT MORE THAN $10,000");
                } else {
                    Transactions.deposit(account, amt);
                }
            }

            else {
                Console.displayLine();
                Console.displayLine("Wrong input.  Please try again!");
                Console.displayLine();
            }

            Console.displayLine();
            display = Console.getString("Continue (y/n): ");
            display = display.trim();
            Console.displayLine();
        }

        Console.displayLine("Monthly Fees");
        account.subtractMonthlyFee();
        Console.displayLine("Checking fee: \t" + account.getMonthlyFeeFormatted());

        Console.displayLine();
        Console.displayLine("Final Balance");
        Console.displayLine("Checking: " + "$" + account.getBalance());
    }

}
