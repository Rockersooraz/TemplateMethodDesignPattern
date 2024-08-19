import Payment.BankTransfer;
import Payment.CreditCardPayment;
import Payment.PaypalPayment;

public class Main {
    public static void main(String[] args) {
        PaypalPayment paypalPayment = new PaypalPayment();
        paypalPayment.reviewPayment();

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.reviewPayment();

        BankTransfer bankTransfer = new BankTransfer();
        bankTransfer.processPayment();
        bankTransfer.reviewPayment();
        bankTransfer.verifyPayment();
        bankTransfer.finalizePayment();
    }
}