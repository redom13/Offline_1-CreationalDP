package account;
public class RegularAccount implements Account{
    private double interestRate=0.025;
    private double principal;
    // Constructor
    public RegularAccount(double principal){
        this.principal=principal;
    }
    // Calculating the compound interest
    @Override
    public double getTotalInterest(int years) {
        return principal*Math.pow(1+interestRate,years);
    }
    @Override
    public void printAccountType() {
        System.out.println("This is a Regular Account");
    }
}
