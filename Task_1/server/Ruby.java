package Task_1.server;

// Concrete Product
public class Ruby implements WebServer {
    public void addWebServer() {
        System.out.println("Ruby server added");
    }
    
    public String getWebServer() {
        return "Ruby server";
    }
}
