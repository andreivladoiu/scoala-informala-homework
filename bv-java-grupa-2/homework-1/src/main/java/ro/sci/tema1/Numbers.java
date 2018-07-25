package ro.sci.tema1;
import java.util.Scanner;
/**
 *The code reads in 5 separate numbers and calculates their average, the smallest and the largest of them.
 */
public class Numbers {
    public void calculate () {
        Scanner keyboard = new Scanner(System.in);
        double [] a = new double[5];
        System.out.println("Input number:");
        a[0] = keyboard.nextDouble();
        double average = a[0];
        double min = a[0];
        double max = a[0];
        for (int i=1; i<5; i++) {
            System.out.println("Input number:");
            a[i] = keyboard.nextDouble();
            average = average + a[i];
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        average = average/5;
        System.out.println("Average is:" + average);
        System.out.println("Minimum is:" + min);
        System.out.println("Maximum is:" + max);
    }
}
