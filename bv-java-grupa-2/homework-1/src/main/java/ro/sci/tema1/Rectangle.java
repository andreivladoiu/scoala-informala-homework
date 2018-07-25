package ro.sci.tema1;
import java.util.Scanner;
/**
 *The code inputs the dimensions of a rectangle and displays area and perimeter
 */
public class Rectangle {
    public void calculate () {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input length:");
        double length = keyboard.nextDouble();
        System.out.println("Input width:");
        double width = keyboard.nextDouble();
        double area = length * width;
        System.out.println("Area is:" + area);
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter is:" + perimeter);
    }
}
