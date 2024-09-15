// Concrete Factory class for Regular Interest Rate
package factory;

import account.Account;
import account.RegularAccount;
import loan.Loan;
import loan.RegularLoan;

public class RegularInterestRate implements InterestRate{
    @Override
    public Account createAccount(double principal) {
        return new RegularAccount(principal);
    }
    @Override
    public Loan createLoan(double principal) {
        return new RegularLoan(principal);
    }
}
