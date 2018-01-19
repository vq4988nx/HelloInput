import static input.InputUtils.*;

/**
 * Created by vq4988nx on 1/18/2018.
 */
public class HelloInput {

    public static void main(String[] args) {

//        System.out.println("Is this working?");

//        String name = stringInput("Please enter your name");
//        System.out.println("Hello " + name);

//        String s = stringInput("What is your name?");

//        int i = intInput("How many candy bars?");
//        int i2 = positiveIntInput("How many people?");

//        System.out.println(i);
//        System.out.println(i2);

//        double d = doubleInput("What is the price of the item?");
//        double d2 = positiveDoubleInput("How long is the string?");
//
//        System.out.println("The price of the item is $" + d);
//        System.out.println("The length of the string is " + d2 + "inches.");

//        boolean ok = yesNoInput("OK to continue?");
//        System.out.println(ok);

//        String name = stringInput("Please enter your name");
//        int numberOfClasses = positiveIntInput("How many classes are you taking this semester?");
//        if (numberOfClasses == 1) {
//            System.out.println(name + " is taking 1 class.");
//        } else {
//            System.out.println(name + " is taking " + numberOfClasses + " classes.");
//        }
//        System.out.println(name + " is taking " + numberOfClasses + " classes this semester.");

        String productName = stringInput("What is the name of the product?");
        double price = doubleInput("What does a packet of " + productName + " cost?");
        int quantity = intInput("How many packets of " + productName + " to sell?");
        double total = price * quantity;

        System.out.println(quantity + " packets of " + productName + " at $" + price + " each costs $" + total);





    }
}
