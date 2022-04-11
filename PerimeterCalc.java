import java.util.Random;
import java.util.Scanner;

public class PerimeterCalc {
    public static void Perimeter() {
        /*
        Input a number
        Do the perimeter calculation for that number
        Then, randomize a number and do a calculation
         */
        double l;
        double w;
        double p;

        //Input a number
        Scanner sc = new Scanner(System.in);
        System.out.println("When Prompted, enter the length then width.");

        //Assign the scanner into the values l, w , p
        System.out.println("Please enter your length(L)");
        l = sc.nextDouble();

        System.out.println("Please enter your length(W)");
        w = sc.nextDouble();


        //Calculation
        p = ((2 * l) + (2 * w));

        System.out.println("Your answer is: " + p);

        //Then, randomize a number and do a calculation

        int a;
        int b;
        int c;

        Random rand = new Random();

        a = rand.nextInt(16)+1;
        b = rand.nextInt(16)+1;

        System.out.println("\n");
        System.out.println("Example: P = 2(L x W)");
        System.out.println("Random Generated L and W: " + a + "L" + " x " + b + "W");

        c = ((2 * a) + (2 * b));

        System.out.println("The answer is: " + c + "A" + " = " + "2(" + a + "L" + " x " + b + "W" + ")");




    }
}
