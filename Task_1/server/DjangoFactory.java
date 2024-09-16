package Task_1.server;

public class DjangoFactory implements WebServerFactory {
    public WebServer createWebServer() {
        return new Django();
    }
    
}
