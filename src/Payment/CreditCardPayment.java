package Payment;

public class CreditCardPayment extends PaymentProcess {
    @Override
    void authenticate() {
        System.out.println("Authenticating the Credit card payment");
    }

    @Override
    void process() {
        System.out.println("Processing the Credit card payment");
    }

    @Override
    void sendConfirmation() {
        System.out.println("Sending the Credit card payment");

    }

    @Override
    public void reviewPayment() {
        System.out.println("Reviewing the Credit card payment");

    }

    @Override
    public void verifyPayment() {
        System.out.println("Verifying the Credit card payment");
    }

    @Override
    public void finalizePayment() {
        System.out.println("Verifying the Credit card payment");
    }
}
