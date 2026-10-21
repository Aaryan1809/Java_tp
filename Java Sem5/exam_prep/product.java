package exam_prep;

import java.util.Scanner;

public class product {

    float total;
    float discount;
    float pr;
    int qt;
    String nm;

    // taking input directly from the main method
    void inp(float price, String name, int quant) {
        pr = price;
        qt = quant;
        nm = name;
        total = price * quant;
    }

    void disc() {
        if (total < 3000) {
            discount = total * 0.02f;
        } else if (total < 5000) {
            discount = total * 0.04f;
        } else if (total > 5000) {
            discount = total * 0.1f;
        } else if (total < 0) {
            System.out.println("Enter a valid amount to get a discount.");
        }
    }

    float fp() {
        disc();
        float final_price = total - discount;
        return final_price;
    }

}

class product2 {
    float total;
    float discount;
    String name;
    int quant;
    float price;

    void inp() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter product Name : ");
        name = input.nextLine();

        System.out.println("Enter product Price : ");
        price = input.nextFloat();

        System.out.println("Enter the Quantity for the product");
        quant = input.nextInt();
        total = price * quant;
    }

    float disc() {

        if (total < 3000) {
            discount = total * 0.02f;
            return discount;
        }

        else if (total < 5000) {
            discount = total * 0.04f;
            return discount;
        }

        else {
            discount = total * 0.1f;
            return discount;
        }
    }

    void bill() {
        discount = disc();
        System.out.println(total);
        System.out.println(
                "The final Amount to be paid is " + (total - discount) + " for " + name + " for " + quant + " units.");
    }
}

class product3 {
    int qt;
    float pr;
    String nm;
    product3(float price, String name, int quant) {
        qt = quant;
        pr = price;
        nm = name;
        
    }
}

class calling {
    public static void main(String[] args) {

        // // call 1 by using method 1
        // product obj = new product();
        // obj.inp(100, "Biscuits", 25);
        // float bill = obj.fp();
        // System.out.println("Total bill for the " + obj.nm + " For " + obj.qt + "
        // units is " + bill);

        // call 2 by using method 2
        // product2 obj2 = new product2();
        // obj2.inp();
        // obj2.bill();

        // call 3 by using paramterized constructors 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter product Name : ");
        String name = input.nextLine();

        System.out.println("Enter product Price : ");
        float price = input.nextFloat();

        System.out.println("Enter the Quantity for the product");
        int quant = input.nextInt();

        product3 obj3 = new product3(price, name, quant);
    }

}