
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        //Implement a switch case
        //Create a loop for the switch case
        //If "menu" is typed, restart the code

            Scanner scan = new Scanner(System.in);

        for(int i=0; i == i; i++) {

            System.out.println("Please press \"1\" for Area Calculator of Rectangle");
            System.out.println("Please press \"2\" for Perimeter Calculator of Rectangle");
            System.out.println("Please press \"3\" for Fahrenheit to Celsius Calculator");
            System.out.println("Please press \"4\" for Celsius to Fahrenheit Calculator");

            switch (scan.nextInt()) {

                case 1:
                    AreaCalc.Area();
                    break;


                case 2:
                    PerimeterCalc.Perimeter();
                    break;

                case 3:
                    FahrenheitCalc.Fahrenheit();
                    break;

                case 4:
                    FahrenheitCalc.Celsius();
                    break;


            }


            System.out.println("\n");
        }
    }
}

