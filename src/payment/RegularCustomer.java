package payment;

import java.util.ArrayList;

public class RegularCustomer extends Customer{

    ArrayList<String>names = new ArrayList<>();
    public RegularCustomer (String name){
        super(name);
        names.add(name);
    }

    @Override
    public void displayCustomerInfo() {
        for (String nameCustomer : names){
            System.out.println(nameCustomer + " :" + "Regular Customer");
        }
    }
}
