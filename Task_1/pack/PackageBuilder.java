package Task_1.pack;

import Task_1.controller.Controller;
import Task_1.display.Display;
import Task_1.microController.*;
import Task_1.payment.PaymentTerminal;
import Task_1.storage.Storage;
import Task_1.ticketing.IdentificationCards;

// Concrete Builder
public class PackageBuilder implements Builder {
    private Package pack;

    public PackageBuilder() {
        this.pack = new Package();
    }

    public Builder addName(String name) {
        this.pack.setName(name);
        return this;
    }

    public Builder addMicroController(MicroController microController) {
        this.pack.setMicroController(microController);
        return this;
    }

    public Builder addDisplay(Display display) {
        this.pack.setDisplay(display);
        return this;
    }

    public Builder addIdentificationCards(IdentificationCards identificationCards) {
        this.pack.setIdentificationCards(identificationCards);
        return this;
    }

    public Builder addPaymentTerminal(PaymentTerminal paymentTerminal) {
        this.pack.setPaymentTerminal(paymentTerminal);
        return this;
    }

    public Builder addStorage(Storage storage) {
        this.pack.setStorage(storage);
        return this;
    }

    public Builder addController(Controller controller) {
        this.pack.setController(controller);
        return this;
    }

    public Package getPackage() {
        return this.pack;
    }
}
