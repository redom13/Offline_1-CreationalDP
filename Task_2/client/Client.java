package client;

import factory.InterestRate;
import factory.PremiumInterestRate;
import factory.RegularInterestRate;
import factory.VIPInterestRate;

public class Client {
    // Constructor
    int customerType;
    InterestRate interestRate;
    public Client(int customerType){ 
        this.customerType=customerType;
        this.interestRate=null;
    }
    public InterestRate getInterestRate(){
        switch(customerType){
            case 1:
                return interestRate=new RegularInterestRate();
            case 2:
                return interestRate=new PremiumInterestRate();
            case 3:
                return interestRate=new VIPInterestRate();
            default:
                return null;
        }
    }
}
