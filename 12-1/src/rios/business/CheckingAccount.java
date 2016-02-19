package rios.business;
import java.text.NumberFormat;

/**
 * Created by eduardoriosjr on 2/19/16.
 */
public class CheckingAccount extends Account {
    private double fee = 1;

    public void subtractMonthlyFee(){
        this.balance -= fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public String getMonthlyFeeFormatted() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(this.fee);
    }
}
