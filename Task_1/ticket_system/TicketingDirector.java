package Task_1.ticket_system;

public class TicketingDirector {
    private TicketingBuilder ticketingBuilder;

    public TicketingDirector(TicketingBuilder ticketingBuilder) {
        this.ticketingBuilder = ticketingBuilder;
    }

    public TicketingSystem constructTicketingSystem(int packageType, int internetType, int webServerType) {
        if (packageType != 1 && packageType != 2 && packageType != 3 && packageType != 4) {
            System.out.println("Invalid package type.");
            return null;
        }
        else if (internetType != 1 && internetType != 2 && internetType != 3) {
            System.out.println("Invalid internet connection type.");
            return null;
        }
        else if (webServerType != 1 && webServerType != 2 && webServerType != 3) {
            System.out.println("Invalid web server type.");
            return null;
        }
        else if (packageType == 1 || packageType == 2){
            if (internetType==1){
                System.out.println("Sorry, you cannot have an Ethernet connection with the ATMega32 or Arduino.");
                return null;
            }
        }
        return ticketingBuilder.buildPackage(packageType)
                            .buildInternet(internetType)
                            .buildWebServer(webServerType)
                            .getTicketingSystem();
    }
}
