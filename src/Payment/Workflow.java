package Payment;

public interface Workflow {

    void processPayment();

    void reviewPayment();

    void verifyPayment();

    void finalizePayment();


}
