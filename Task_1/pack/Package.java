package Task_1.pack;

import Task_1.display.Display;
import Task_1.microController.*;
import Task_1.payment.PaymentTerminal;
import Task_1.storage.Storage;
import Task_1.ticketing.IdentificationCards;
import Task_1.controller.Controller;

public class Package {
    private MicroController microController;
    private Display display;
    private IdentificationCards identificationCards;
    private String name;
    // private PaymentTerminal paymentTerminal;
    private Storage storage;
    private Controller controller;

    // Constuctor
    public Package() {
        this.name = null;
        this.microController = null;
        this.display = null;
        this.identificationCards = null;
        //this.paymentTerminal = null;
        this.storage = null;
        this.controller = null;
    }

    // Setter Methods
    public void setMicroController(MicroController microController) {
        this.microController = microController;
        microController.addController();
    }

    public void setDisplay(Display display) {
        this.display = display;
        display.addDisplay();
    }

    public void setIdentificationCards(IdentificationCards identificationCards) {
        this.identificationCards = identificationCards;
        identificationCards.addCard();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaymentTerminal(PaymentTerminal paymentTerminal) {
        //this.paymentTerminal = paymentTerminal;
        paymentTerminal.addPaymentTerminal();
    }

    public void setStorage(Storage storage) {
        // This will only be called if Raspberry Pi is not used
        this.storage = storage;
        storage.getStorage();
    }

    public void setController(Controller controller) {
        // This will only be called if Raspberry Pi & Touch Screen Display is not used
        this.controller = controller;
        controller.addController();
    }

    // Details of the package
    public void packageDetails(){
        System.out.println("Package Name: " + name);
        System.out.println("Micro Controller: " + microController.getController());  
        System.out.println("Display: " + display.getDisplay());
        System.out.println("Identification Cards: " + identificationCards.getCard());
        if (storage != null) {
            System.out.println("Storage: SD Card");
        }
        else {
            System.out.println("Storage: Default");
        }
        if (controller != null) {
            System.out.println("Controller: " + controller.getController());
        }
        else {
            System.out.println("Controller: Touch Screen");
        }

    }

    // Getter Method
    // public String getPackageName() {
    //     return name;
    // }

    // public MicroController getMicroController() {
    //     return microController;
    // }

    // public Display getDisplay() {
    //     return display;
    // }

    // public IdentificationCards getIdentificationCards() {
    //     return identificationCards;
    // }

    // public PaymentTerminal getPaymentTerminal() {
    //     return paymentTerminal;
    // }

    // public Storage getStorage() {
    //     return storage;
    // }

    // public Controller getController() {
    //     return controller;
    // }
}
