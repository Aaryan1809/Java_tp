// Person → Customer → PremiumCustomer. Person: name, age; displayPerson(). Customer: customerId; displayCustomer(). PremiumCustomer: discount; displayPremium(). Create a PremiumCustomer object and display all details. Validation: age and customerId > 0; discount 0–50%.

class Person{
    String name;
    int age;

    void displayPerson()
    {
        System.out.println(name);
        System.out.println(age);
    }
}

class Customer extends Person{
    int customerId;
    void displayCustomer()
    {
        displayPerson();
        System.out.println(customerId);
    }
}

class PremiumCustomer extends Customer{
    int discount;
    void displayPremium()
    {
        displayCustomer();
        System.out.println(discount);
    }
}

public class calling2 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
