package rios.business;

import java.text.NumberFormat;
import rios.account.interfaces.Balanceable;
import rios.account.interfaces.Depositable;
import rios.account.interfaces.Withdrawable;

/**
 * Created by eduardoriosjr on 2/19/16.
 */
public class Account implements Balanceable, Depositable, Withdrawable {

    protected double balance = 1000;

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void setBalance(double amount) {
        this.balance = amount;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public String getBalanceFormatted() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(this.balance);
    }
}
