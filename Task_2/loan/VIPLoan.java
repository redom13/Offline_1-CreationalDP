package loan;
public class VIPLoan implements Loan{
    private double interestRate = 0.10;
    private double principal;
    // Constructor
    public VIPLoan(double principal){
        this.principal = principal;
    }
    // Calculating the total interest for a given number of years
    @Override
    public double getTotalInterest(int years) {
        return principal*Math.pow(1+interestRate,years);
    }
    // Printing the type of loan
    @Override
    public void printLoanType() {
        System.out.println("This is a Loan for VIP Customers");
    }
}
