package com.ocp.briefer;

public class Question26 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Larry", "Smith");
        Customer c2 = new Customer("Pedro", "Gonzales");
        Customer c3 = new Customer("Penny", "Jones");
        Customer c4 = new Customer("Lars", "Svenson");
        c4 = null;
        c3 = c2;
        System.out.println(Customer.getCount());
    }
}

 class Customer {
    private String fName;
    private String lName;
    private static int count;

    public Customer(String first, String last) {
        fName = first;
        lName = last;
        ++count;
    }

    static {
        count = 0;
    }

    public static int getCount() {
        return count;
    }
}
