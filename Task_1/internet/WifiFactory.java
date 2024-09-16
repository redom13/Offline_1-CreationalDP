package Task_1.internet;

public class WifiFactory implements InternetConnection {
    public Internet createConnection() {
        return new Wifi();
    }
    
}
