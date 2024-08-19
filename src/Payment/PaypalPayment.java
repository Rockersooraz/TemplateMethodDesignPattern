package Payment;

public class PaypalPayment extends PaymentProcess {
    @Override
    void authenticate() {
        System.out.println("Verifying the Paypal payment");
    }

    @Override
    void process() {
        System.out.println("Processing the Paypal payment");

    }

    @Override
    void sendConfirmation() {
        System.out.println("Sending confirmation for the Paypal payment");

    }

    @Override
    public void reviewPayment() {
        super.reviewPayment();
        System.out.println("Reviewing for the Paypal payment");
    }

    @Override
    public void verifyPayment() {
        System.out.println("Verifying for the Paypal payment");


    }

    @Override
    public void finalizePayment() {
        System.out.println("Finalize for the Paypal payment");
    }
}
