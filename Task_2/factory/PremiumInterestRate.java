// Concrete Factory class for Premium Interest Rate
package factory;

import account.Account;
import account.PremiumAccount;
import loan.Loan;
import loan.PremiumLoan;

public class PremiumInterestRate implements InterestRate{
    @Override
    public Account createAccount(double principal) {
        return new PremiumAccount(principal);
    }
    @Override
    public Loan createLoan(double principal) {
        return new PremiumLoan(principal);
    }
}
