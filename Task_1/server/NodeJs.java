package Task_1.server;

// Concrete Product
public class NodeJs implements WebServer {
    public void addWebServer() {
        System.out.println("NodeJs added to the server");
    }
    
    public String getWebServer() {
        return "NodeJs server";
    }
}
