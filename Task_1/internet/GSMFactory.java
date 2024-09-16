package Task_1.internet;

public class GSMFactory implements InternetConnection {
    public Internet createConnection() {
        return new GSM();
    }
}
