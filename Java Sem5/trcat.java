import java.util.*;

public class trcat {
    public static void main(String[] args) {
        try{
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter Pin - ");
            String inppin = inp.nextLine();
            int pin = Integer.parseInt(inppin);
            System.out.println(pin);
            System.out.println("All ok");
        }
        catch (Exception abc)
        {
            System.out.println("Pin should be numbers");
        }
    }
}