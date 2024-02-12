package fromUdemy.boxingUnboxing;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions().add(initialDeposit); //autoboxing
    }
}
public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob S.", 1000);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane A.", 500);
        System.out.println(bank);

        bank.addTransaction("Jane A.", -10.40);
        bank.addTransaction("Jane A.", 120.10);
        bank.printStatement("Jane a.");

        bank.addNewCustomer("Bob S.", 200);
        bank.addTransaction("Bob S.", -100);
        bank.printStatement("bob s.");

    }

}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    private Customer getCustomer (String customerName) {
        for (Customer customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn t found %n", customerName);

        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New customer added: " + customer);
        }
    }

    public void addTransaction(String name, double transactionAmount) {

        Customer customer = getCustomer(name);
        if (customer != null) {
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName) {

        Customer customer = getCustomer(customerName);
        if (customer == null) {
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Cusotmer name: " + customer.name());
        System.out.println("Transactions: ");
        for (double transaction : customer.transactions()) {  //unboxing
            System.out.printf("$%10.2f (%s)%n", transaction, transaction < 0 ? "debit" : "credit");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
