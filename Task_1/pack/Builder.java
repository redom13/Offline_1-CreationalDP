package Task_1.pack;

import Task_1.controller.Controller;
import Task_1.display.Display;
import Task_1.microController.*;
import Task_1.payment.PaymentTerminal;
import Task_1.storage.Storage;
import Task_1.ticketing.IdentificationCards;

public interface Builder {
    public Builder addMicroController(MicroController microController);
    public Builder addDisplay(Display display);
    public Builder addIdentificationCards(IdentificationCards identificationCards);
    public Builder addName(String name);
    public Builder addPaymentTerminal(PaymentTerminal paymentTerminal);
    public Builder addStorage(Storage storage);
    public Builder addController(Controller controller);
    public Package getPackage();
}
