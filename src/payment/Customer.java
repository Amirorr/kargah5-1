package payment;

import java.util.ArrayList;

public abstract class  Customer {
    String name;
    ArrayList<String>paymentHistory;

    public Customer(String name){
        this.name = name;
        this.paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(interfaces.PaymentStrategy paymentStrategy, double amount){
        paymentStrategy.pay(amount);
        paymentHistory.add(paymentStrategy.getPaymentDetails());

    }

    public void showPaymentHistory(){
        for (String paymentHistory : paymentHistory){
            System.out.println(paymentHistory);
        }
    }
}
