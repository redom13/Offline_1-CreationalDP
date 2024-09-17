package Task_1.client;

import java.util.Scanner;

import Task_1.internet.Internet;
import Task_1.pack.Package;
import Task_1.server.WebServer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Ticketing System!");
        Scanner scn=new Scanner(System.in);
        Client client = new Client();
        System.out.println("Please select the type of package:");
        System.out.println("1. Basic");
        System.out.println("2. Standard");
        System.out.println("3. Advanced");
        System.out.println("4. Premium");
        int type = scn.nextInt();
        Package pack = client.getPackage(type);
        for (int i=0;i<50;i++) {
            System.out.print("-");
        }
        System.out.println();
        if (pack==null) {
            System.out.println("Invalid package type selected.");
        }
        System.out.println("Do you want to print the details of the package?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int choice = scn.nextInt();
        if (choice==1){
            System.out.println("Package Details:");
            for (int i=0;i<50;i++) {
                System.out.print("-");
            }
            System.out.println();
            pack.packageDetails();
            for (int i=0;i<50;i++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println("Please select the type of internet connection you want:");
        System.out.println("1. Ethernet");
        System.out.println("2. GSM");
        System.out.println("3. Wifi");
        type = scn.nextInt();
        Internet internet = client.getInternet(type);
        if (internet==null) {
            System.out.println("Invalid internet connection type selected.");
        }
        internet.addInternetConnection();
        for (int i=0;i<50;i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Please select the type of web server you want:");
        System.out.println("1. NodeJs");
        System.out.println("2. Django");
        System.out.println("3. Ruby");
        type = scn.nextInt();
        WebServer webServer = client.getWebServer(type);
        if (webServer==null) {
            System.out.println("Invalid web server type selected.");
        }
        webServer.addWebServer();
        for (int i=0;i<50;i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Thank you for using the Ticketing System!");
        scn.close();
    }
}
