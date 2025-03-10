package payment;

public class PayPalPayment implements interfaces.PaymentStrategy {
    String email;

    public PayPalPayment(String email){
        this.email = email;
    }
    @Override
    public void pay(double amount) {
        System.out.println("amount:" + amount + " " + getPaymentDetails());

    }

    @Override
    public String getPaymentDetails() {
        String massage = "Pay Pal Payment : " + "  " + this.email;
        return massage;
    }
}
