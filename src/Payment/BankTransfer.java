package Payment;

public class BankTransfer extends PaymentProcess{
    @Override
    void authenticate() {
        System.out.println("Authenticating Bank Transfer Payment");
    }

    @Override
    void process() {
        System.out.println("Processing Bank Transfer Payment");
    }

    @Override
    void sendConfirmation() {
        System.out.println("Sending Bank Transfer Payment");
    }

    @Override
    public void verifyPayment() {
        System.out.println("Verifying Bank Transfer Payment");

    }

    @Override
    public void finalizePayment() {
        System.out.println("Finalizing Bank Transfer Payment");
    }
}
