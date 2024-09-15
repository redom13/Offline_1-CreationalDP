package loan;
public interface Loan {
    // Assuming the interest rates to be yearly
    public double getTotalInterest(int years);
    public void printLoanType(); 
} 
