package Task_1.microController;

public class ATMega32 implements MicroController {
    public void addController() {
        System.out.println("ATMega32 has been added to the system.");
    }
    
    public String getController() {
        return "ATMega32";
    }
}
