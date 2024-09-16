package Task_1.client;

import Task_1.internet.EthernetFactory;
import Task_1.internet.GSMFactory;
import Task_1.internet.Internet;
import Task_1.internet.InternetConnection;
import Task_1.internet.WifiFactory;
import Task_1.pack.*;
import Task_1.pack.Package;
import Task_1.server.DjangoFactory;
import Task_1.server.NodeJsFactory;
import Task_1.server.RubyFactory;
import Task_1.server.WebServer;
import Task_1.server.WebServerFactory;

public class Client {
    private Director director;
    private Builder builder;
    private InternetConnection internetConnection;
    private WebServerFactory webServerFactory;

    public Client() {
        builder = new PackageBuilder();
        director = new Director(builder);
    }

    public Package getPackage(int type) {
        return director.constructPackage(type);
    }

    public Internet getInternet(int type){
        // 1. Ethernet
        // 2. GSM
        // 3. Wifi
        switch (type) {
            case 1:
                internetConnection = new EthernetFactory();
                break;
            case 2:
                internetConnection = new GSMFactory();
                break;
            case 3:
                internetConnection = new WifiFactory();
                break;
            default:
                break;
        }
        return internetConnection.createConnection();
    }

    public WebServer getWebServer(int type){
        // 1. NodeJs
        // 2. Django
        // 3. Ruby
        switch (type) {
            case 1: 
                webServerFactory = new NodeJsFactory();
                break;
            case 2:
                webServerFactory = new DjangoFactory();
                break;
            case 3:
                webServerFactory = new RubyFactory();
                break;
            default:
                break;
        }
        return webServerFactory.createWebServer();
    }

}
