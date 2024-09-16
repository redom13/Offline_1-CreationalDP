package Task_1.microController;

public class RaspberryPi implements MicroController{
    public void addController() {
        System.out.println("Raspberry Pi has been added to the system.");
    }

    public String getController() {
        return "Raspberry Pi";
    }
}
