package Payment;

public abstract class PaymentProcess implements Workflow {
    @Override
    public void processPayment() {

        authenticate();

        process();

        sendConfirmation();

    }

     abstract void authenticate();

    abstract void process();

    abstract void sendConfirmation();

    @Override
    public void reviewPayment(){
        System.out.println("Reviewing");
    }

}
