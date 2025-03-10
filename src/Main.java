import payment.*;

public class Main {
    public static void main(String[] args) {
        PremiumCustomer premiumCustomer1 = new PremiumCustomer("amir");
        PremiumCustomer premiumCustomer2 = new PremiumCustomer("nima");
        RegularCustomer regularCustomer1 = new RegularCustomer("mehdi");

        BitcoinPayment bitcoinPaymentForAmir = new BitcoinPayment("1863453931");
        PayPalPayment payPalPaymentForAmir = new PayPalPayment("rm4324@gmail.com");

        CreditCardPayment creditCardPaymentForNima = new CreditCardPayment("6104334588256644", "nima");
        PayPalPayment payPalPaymentForNima = new PayPalPayment("nime@gmail.com");

        BitcoinPayment bitcoinPaymentForMehdi = new BitcoinPayment("1884613544837");
        CreditCardPayment creditCardPaymentForMehdi = new CreditCardPayment("6221068722456245", "mehdi");

        regularCustomer1.displayCustomerInfo();
        premiumCustomer1.displayCustomerInfo();
        premiumCustomer2.displayCustomerInfo();

        System.out.println();
        premiumCustomer1.makePayment(payPalPaymentForAmir, 200);
        premiumCustomer1.makePayment(bitcoinPaymentForAmir, 300.56);
        System.out.println();
        premiumCustomer1.showPaymentHistory();
        System.out.println();

        premiumCustomer2.makePayment(creditCardPaymentForNima, 500.98);
        premiumCustomer2.makePayment(payPalPaymentForNima, 900);
        System.out.println();
        premiumCustomer2.showPaymentHistory();
        System.out.println();

        regularCustomer1.makePayment(bitcoinPaymentForMehdi, 789);
        regularCustomer1.makePayment(creditCardPaymentForMehdi, 800);
        System.out.println();
        regularCustomer1.showPaymentHistory();




    }
}