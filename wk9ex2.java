import java.util.Scanner;

public class RectangleCalc {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner myObj = new Scanner(System.in);

        // Take user input for length
        System.out.printIn("What is the length of the rectangle: ");
        // Declare a double variable to hold user input
        double length = myObj.nextDouble();

        // Take user input for width
        System.out.printIn("What is the width of the rectangle: ");
        // Declare a double variable to hold user input
        double width = myObj.nextDouble();

        // Message for results
        System.out.printIn("Results:");

        // Calculate area
        System.out.printIn("Area of the rectangle: " + (length * width));

        // Calculate perimeter
        System.out.printIn("Perimeter of the rectangle: " + (2 * (length + width)));
       
    }
}