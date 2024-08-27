import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Nate Gill
 * @version 8/23/2024
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Robux to USD");
        System.out.println("8. USD to Robux");
        System.out.println("9. Dollars to 1989 Nissan S Cargo");
        System.out.println("10. 1989 Nissan S Cargo to Dollars");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit-32) / (9.0/5.0);
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsiuzs");
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet * 3.281;
            System.out.println(feet + " degrees Feet is " + meters + " degrees Meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double div = 3.281;
            double feet = meters / div;
            System.out.println(meters + " Meters is " + feet + " feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double div = 3.281;
            double feet = meters / div;
            System.out.println(meters + " Meters is " + feet + " feet");
        }
        if (selection == 6)
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double div = 3.281;
            double feet = meters / div;
            System.out.println(meters + " Meters is " + feet + " feet");
        }
        if (selection == 7)
        {
            System.out.println("Enter Robux: ");
            double robux = keyboard.nextDouble();
            keyboard.nextLine();
            double dollars = robux / 100;
            System.out.println(robux + " Robux is " + dollars + " Dollars");
        }
        if (selection == 8)
        {
            System.out.println("Enter Dollars: ");
            double dollars = keyboard.nextDouble();
            keyboard.nextLine();
            double robux = dollars * 100;
            System.out.println(dollars + " Dollars is " + robux + " Robux");
        }
        if (selection == 9)
        {
            System.out.println("Enter Dollars: ");
            double dollars = keyboard.nextDouble();
            keyboard.nextLine();
            double nissan = dollars / 17000;
            System.out.println(dollars + " Dollars is " + nissan + " 1989 Nissan S Cargos");
        }
        if (selection == 10)
        {
            System.out.println("Enter 1989 Nissan S Cargos: ");
            double nissan = keyboard.nextDouble();
            keyboard.nextLine();
            double dollars = nissan * 17000;
            System.out.println(nissan + " 1989 Nissan S Cargos is " + dollars + " Dollars");
        }
    }
}