package Task_1.server;

public class NodeJsFactory implements WebServerFactory {
    public WebServer createWebServer() {
        return new NodeJs();
    }
    
}
