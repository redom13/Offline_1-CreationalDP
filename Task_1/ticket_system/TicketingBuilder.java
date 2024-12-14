package Task_1.ticket_system;

public interface TicketingBuilder {
    public TicketingBuilder buildPackage(int packageType);
    public TicketingBuilder buildInternet(int internetType);
    public TicketingBuilder buildWebServer(int webServerType);
    public TicketingSystem getTicketingSystem();
}
