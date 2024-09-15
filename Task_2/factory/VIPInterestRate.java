// Concrete Factory class for VIP Interest Rate
package factory;

import account.Account;
import account.VIPAccount;
import loan.Loan;
import loan.VIPLoan;

public class VIPInterestRate implements InterestRate{
    @Override
    public Account createAccount(double principal) {
        return new VIPAccount(principal);
    }
    @Override
    public Loan createLoan(double principal) {
        return new VIPLoan(principal);
    }
}
