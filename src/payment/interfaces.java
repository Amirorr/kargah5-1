package payment;

public class interfaces {

    public interface PaymentStrategy {
        public void pay (double amount);
        public String getPaymentDetails ();
    }
}
