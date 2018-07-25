package ro.sci.tema1;

import java.util.Scanner;
/**
 *The code inputs 3 numbers and displays the biggest
 */
public class Biggest {
       public void max () {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Input numbers:");
            double a = keyboard.nextDouble();
            double b = keyboard.nextDouble();
            double c = keyboard.nextDouble();
            double maxim = a;
            if (b > maxim) {
                maxim = b;
            }
            if (c > maxim) {
                maxim = c;
            }
            System.out.println("The biggest number is:" + maxim);
        }
}
