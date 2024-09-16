package Task_1.display;

public class LED implements Display {
    public void addDisplay() {
        System.out.println("LED has been added to the system.");
    }
    
    public String getDisplay() {
        return "LED";
    }
}
