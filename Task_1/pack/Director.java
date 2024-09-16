package Task_1.pack;

import Task_1.controller.Controller;
import Task_1.display.LCD;
import Task_1.display.LED;
import Task_1.display.OLED;
import Task_1.display.TouchScreen;
import Task_1.microController.ATMega32;
import Task_1.microController.Arduino;
import Task_1.microController.RaspberryPi;
import Task_1.payment.PaymentTerminal;
import Task_1.storage.Storage;
import Task_1.ticketing.NFC;
import Task_1.ticketing.RFID;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // Construct Package
    public Package constructPackage(int type){
        // 1. Basic
        // 2. Standard
        // 3. Advanced
        // 4. Premium
        switch (type) {
            case 1:
                return builder.addName("Basic")
                        .addMicroController(new ATMega32())
                        .addDisplay(new LCD())
                        .addIdentificationCards(new RFID())
                        .addPaymentTerminal(new PaymentTerminal())
                        .addStorage(new Storage())
                        .addController(new Controller())
                        .getPackage();
            
            case 2:
                return builder.addName("Standard")
                        .addMicroController(new Arduino())
                        .addDisplay(new LED())
                        .addIdentificationCards(new RFID())
                        .addPaymentTerminal(new PaymentTerminal())
                        .addStorage(new Storage())
                        .addController(new Controller())
                        .getPackage();
            case 3:
                return builder.addName("Advanced")
                        .addMicroController(new RaspberryPi())
                        .addDisplay(new OLED())
                        .addIdentificationCards(new NFC())
                        .addPaymentTerminal(new PaymentTerminal())  // No storage for Raspberry Pi
                        .addController(new Controller())
                        .getPackage();
            case 4:
                return builder.addName("Premium")
                        .addMicroController(new RaspberryPi())
                        .addDisplay(new TouchScreen())
                        .addIdentificationCards(new NFC())
                        .addPaymentTerminal(new PaymentTerminal())  // No storage for Raspberry Pi
                        .getPackage(); // No controller for touvh screen with Raspberry Pi
            default:
                return null;
        }
    }
}
