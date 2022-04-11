import java.util.Random;
import java.util.Scanner;

public class AreaCalc {
    public static void Area() {

         /*
         Scanner input
         Take the number and do area calculation
         */
        double l;
        double w;
        double z;

        //Scanner input
        Scanner scanner = new Scanner(System.in);

        //Input information into variable
        System.out.println("When Prompted, enter the length then width.");
        System.out.println("Please type in the length(L): ");
        l = scanner.nextDouble();

        System.out.println("Please type in the width(W): ");
        w = scanner.nextDouble();


        //Calculation
        z = (l * w);
        System.out.println("Your answer is the " + z);

          /*
          Then, randomize a number and do that same calculation
          */

        int x;
        int y;
        int a;

        //Randomize a number
        Random random = new Random();

        x = random.nextInt(16) + 1;
        y = random.nextInt(16) + 1;

        System.out.println("\n");
        System.out.println("Example: A = L x W");
        System.out.println("Random Generated L and W: " + x + "L" + " x " + y + "W");

        a = (x * y);

        System.out.println("The answer is: " + a + "A" + " = " + x + "L" + " x " + y + "W");

    }
}
