package payment;

import java.util.ArrayList;

public class PremiumCustomer extends Customer {
    ArrayList<String> names = new ArrayList<>();
    public PremiumCustomer(String name){
        super(name);
        names.add(name);
    }

    @Override
    public void displayCustomerInfo() {
        for (String nameCustomer : names){
            System.out.println(nameCustomer + " :" + "Premium Customer");
        }
    }
}
