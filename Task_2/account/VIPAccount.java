package account;
public class VIPAccount implements Account{
    private double interestRate=0.05;
    private double principal;
    // Constructor
    public VIPAccount(double principal){
        this.principal=principal;
    }
    // Calculating the compound interest
    @Override
    public double getTotalInterest(int years) {
        return principal*Math.pow(1+interestRate,years);
    }
    @Override
    public void printAccountType() {
        System.out.println("This is a VIP Account");
    }
}
