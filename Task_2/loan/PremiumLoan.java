package loan;
public class PremiumLoan implements Loan{
    private double interestRate = 0.12;
    private double principal;
    // Constructor
    public PremiumLoan(double principal){
        this.principal = principal;
    }
    // Calculating the total interest for a given number of years
    @Override
    public double getTotalInterest(int years) {
        return principal*Math.pow(1+interestRate,years);
    }

    @Override
    public void printLoanType() {
        System.out.println("This is a Loan for Premium Customers");
    }
    
}
