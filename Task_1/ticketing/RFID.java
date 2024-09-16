package Task_1.ticketing;

public class RFID implements IdentificationCards {
    public void addCard() {
        System.out.println("RFID card will be used for identification.");
    }
    
    public String getCard() {
        return "RFID";
    }
}
