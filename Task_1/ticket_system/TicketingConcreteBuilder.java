package Task_1.ticket_system;

import Task_1.internet.InternetConnection;
import Task_1.pack.Director;
import Task_1.pack.Package;
import Task_1.pack.PackageBuilder;
import Task_1.server.WebServerFactory;

public class TicketingConcreteBuilder implements TicketingBuilder {
    private TicketingSystem ticketingSystem;
    private Director packageDirector;
    private InternetConnection internetFactory;
    private WebServerFactory webServerFactory;

    public TicketingConcreteBuilder() {
        this.ticketingSystem = new TicketingSystem();
    }
    
    public TicketingBuilder buildPackage(int packageType) {
        packageDirector = new Director(new PackageBuilder());
        Package pack = packageDirector.constructPackage(packageType);
        this.ticketingSystem.setPackage(pack);
        return this;
    }
    
    public TicketingBuilder buildInternet(int internetType) {
        switch (internetType) {
            case 1:
                internetFactory = new Task_1.internet.EthernetFactory();
                break;
            case 2:
                internetFactory = new Task_1.internet.GSMFactory();
                break;
            case 3:
                internetFactory = new Task_1.internet.WifiFactory();
                break;
            default:
                break;
        }
        this.ticketingSystem.setInternet(internetFactory.createConnection());
        return this;
    }
    
    public TicketingBuilder buildWebServer(int webServerType) {
        switch (webServerType) {
            case 1:
                webServerFactory = new Task_1.server.NodeJsFactory();
                break;
            case 2:
                webServerFactory = new Task_1.server.DjangoFactory();
                break;
            case 3:
                webServerFactory = new Task_1.server.RubyFactory();
                break;
            default:
                break;
        }
        this.ticketingSystem.setWebServer(webServerFactory.createWebServer());
        return this;
    }
    
    public TicketingSystem getTicketingSystem() {
        return this.ticketingSystem;
    }
    
}
