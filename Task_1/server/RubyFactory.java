package Task_1.server;

public class RubyFactory implements WebServerFactory {
    public WebServer createWebServer() {
        return new Ruby();
    }
    
}
