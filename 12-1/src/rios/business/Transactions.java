package rios.business;
import rios.account.interfaces.Depositable;
import rios.account.interfaces.Withdrawable;

/**
 * Created by eduardoriosjr on 2/19/16.
 */
public class Transactions {

    public static void deposit(Depositable account, double amount) {
        account.deposit(amount);
    }

    public static void withdraw(Withdrawable account, double amount) {
        account.withdraw(amount);
    }

}

