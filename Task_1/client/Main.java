package Task_1.client;

import java.util.Scanner;

import Task_1.ticket_system.TicketingBuilder;
import Task_1.ticket_system.TicketingConcreteBuilder;
import Task_1.ticket_system.TicketingDirector;
import Task_1.ticket_system.TicketingSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Ticketing System!");
        Scanner scn=new Scanner(System.in);
        System.out.println("Please select the type of package:");
        System.out.println("1. Basic: ATMega32 with LCD display");
        System.out.println("2. Standard:  Arduino Mega with LED display");
        System.out.println("3. Advanced: Raspberry Pi with OLED display");
        System.out.println("4. Premium: Raspberry Pi with Touch Screen display");
        int packageType = scn.nextInt();
        for (int i=0;i<50;i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Please select the type of internet connection you want:(Note: Ethernet connection is not available for ATMega32 and Arduino)");
        System.out.println("1. Ethernet");
        System.out.println("2. GSM");
        System.out.println("3. Wifi");
        int internetType = scn.nextInt();
        for (int i=0;i<50;i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Please select the type of web server you want:");
        System.out.println("1. NodeJs");
        System.out.println("2. Django");
        System.out.println("3. Ruby");
        int webServerType = scn.nextInt();
        for (int i=0;i<50;i++) {
            System.out.print("-");
        }
        System.out.println();
        TicketingBuilder ticketingBuilder = new TicketingConcreteBuilder();
        TicketingDirector ticketingDirector = new TicketingDirector(ticketingBuilder);
        TicketingSystem ticketingSystem = ticketingDirector.constructTicketingSystem(packageType, internetType, webServerType);
        if (ticketingSystem != null) {
            System.out.println("Do you want to print the details of the ticketing system?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int choice = scn.nextInt();
            if (choice==1){
                for (int i=0;i<50;i++) {
                    System.out.print("-");
                }
                System.out.println();
                ticketingSystem.printDetails();
            }
            
        }
        for (int i=0;i<50;i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Thank you for using the Ticketing System!");
        scn.close();
    }
}
