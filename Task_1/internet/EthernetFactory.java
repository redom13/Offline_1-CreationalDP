package Task_1.internet;

public class EthernetFactory implements InternetConnection {
    public Internet createConnection() {
        return new Ethernet();
    }
    
}
