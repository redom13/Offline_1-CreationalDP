package account;
public class PremiumAccount implements Account{
    private double interestRate=0.035;
    private double principal;
    // Constructor
    public PremiumAccount(double principal){
        this.principal=principal;
    }
    // Calculating the compound interest
    @Override
    public double getTotalInterest(int years) {
        return principal*Math.pow(1+interestRate,years);
    }
    @Override
    public void printAccountType() {
        System.out.println("This is a Premium Account");
    }
}
