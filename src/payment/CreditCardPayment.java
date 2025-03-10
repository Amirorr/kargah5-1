package payment;

public class CreditCardPayment implements interfaces.PaymentStrategy {
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName){
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    @Override
    public void pay(double amount) {

        System.out.println("amount:" + amount + " " + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        String massage = "Credit Card Payment : " +"  " + this.cardNumber +"  " + this.cardHolderName;
        return massage;
    }
}
