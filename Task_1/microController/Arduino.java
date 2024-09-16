package Task_1.microController;

public class Arduino implements MicroController {
    public void addController() {
        System.out.println("Arduino Mega has been added to the system.");
    }

    public String getController() {
        return "Arduino Mega";
    }
}
