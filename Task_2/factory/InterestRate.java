package factory;

import account.Account;
import loan.Loan;

public interface InterestRate {
    public Account createAccount(double principal);
    public Loan createLoan(double principal);
}
