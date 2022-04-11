import java.util.Scanner;

public class FahrenheitCalc {
    public static void Fahrenheit() {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;

        System.out.println("Please type in your Fahrenheit number");
        a = scanner.nextDouble();

        //Calculation
        b = (a - 32)*5/9;

        System.out.println("Your number " + a + " in Fahrenheit is " + b + " in Celsius");
        System.out.println("(" + Math.round(a) + " - 32) * 5/9 = " + Math.round(b));
        System.out.println("(F - 32) * 5/9 = C");

    }

    public static void Celsius() {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;

        System.out.println("Please type in your Celsius number");
        a = scanner.nextDouble();

        //Calculation
        b = (a * 9/5) + 32;

        System.out.println("Your number " + a + " in Celsius is " + b + " in Fahrenheit");
        System.out.println("(" + Math.round(a) + " * 9/5) + 32 = " + Math.round(b));
        System.out.println("(C * 9/5) + 32 = F");

    }
}
