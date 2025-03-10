package payment;

public class BitcoinPayment implements interfaces.PaymentStrategy {
    String walletAddress;

    public BitcoinPayment(String walletAddress){
        this.walletAddress = walletAddress;
    }
    @Override
    public void pay(double amount) {
        System.out.println("amount:" + amount + " " + getPaymentDetails());

    }

    @Override
    public String getPaymentDetails() {
        String massage = "Bitcoin Payment : " + this.walletAddress;
        return massage;
    }
}
