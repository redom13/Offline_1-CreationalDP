package Task_1.ticket_system;

import Task_1.internet.Internet;
import Task_1.pack.Package;
import Task_1.server.WebServer;

public class TicketingSystem {
    private Package package1;
    private Internet internet;
    private WebServer webServer;

    // Setter 
    public void setPackage(Package package1) {
        this.package1 = package1;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }

    public void setWebServer(WebServer webServer) {
        this.webServer = webServer;
    }

    // Getter

    public Package getPackage() {
        return package1;
    }

    public Internet getInternet() {
        return internet;
    }

    public WebServer getWebServer() {
        return webServer;
    }

    public void printDetails(){
        package1.packageDetails();
        System.out.println("Internet: " + internet.getInternetConnection());
        System.out.println("Web Server: " + webServer.getWebServer());
    }
}
