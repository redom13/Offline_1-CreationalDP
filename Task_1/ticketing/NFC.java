package Task_1.ticketing;

public class NFC implements IdentificationCards {
    public void addCard() {
        System.out.println("NFC card will be used for identification.");
    }
    
    public String getCard() {
        return "NFC";
    }
}
