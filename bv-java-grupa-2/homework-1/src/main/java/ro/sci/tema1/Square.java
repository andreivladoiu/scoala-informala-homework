package ro.sci.tema1;
import java.util.Scanner;
/**
 *The code inputs the length of the side of a square, and display its area.
 *Produces an error message if the length is negative.
 */
public class Square {
    public void calculate () {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input length:");
        double length = keyboard.nextDouble();
        if (length<0) {
            System.out.println("The length is negative");
        } else {
            double area = length * length;
            System.out.println("Area is:" + area);
        }
    }
}
