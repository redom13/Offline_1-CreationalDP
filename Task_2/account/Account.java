package account;
public interface Account {
    // Assuming the interest rates to be yearly
    public double getTotalInterest(int years);
    public void printAccountType();
}
