import java.util.Scanner;
// Product → ElectronicProduct → Mobile. Product: productId, name; displayProduct(). ElectronicProduct: warranty; displayElectronic(). Mobile: ram, storage; displayMobile(). Create a Mobile object and display all product details. Validation: RAM and storage must be > 0.

class Product {
    String name;
    int ProductID;

    void displayProduct() {
        System.out.println("Name - " + name);
        System.out.println("Product ID - " + ProductID);
    }
}

class ElectronicProduct extends Product {
    int warranty;

    void displayElectronic() {
        displayProduct();
        System.out.println("Warranty - " + warranty);
    }
}

class Mobile extends ElectronicProduct {
    int ram;
    int storage;

    void displayMobile() {
        displayElectronic();
        System.out.println("Ram - " + ram);
        System.out.println("Storage - " + storage);
    }
}

public class calling {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Mobile m = new Mobile();

        System.out.println("Enter name");
        m.name = inp.nextLine();
        System.out.println("Enter ID");
        m.ProductID = inp.nextInt();

        System.out.println("Enter Warranty");
        m.warranty = inp.nextInt();

        do {
            System.out.println("Enter ram");
            m.ram = inp.nextInt();

            if (m.ram < 0)
                System.out.println("Enter valid ram GB");
        } while (m.ram < 0);

        do {
            System.out.println("Enter Storage");
            m.storage = inp.nextInt();

            if (m.storage < 0)
                System.out.println("Enter valid Storage GB");
        } while (m.storage < 0);

        System.out.println("details");
        m.displayMobile();
    }
}