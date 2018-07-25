package ro.sci.tema1;
import java.util.Scanner;
/**
 *The code displays the smallest number from a collection of numbers
 */
public class Min {
    public void find () {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input collection size:");
        int size = keyboard.nextInt();
        int[] collection = new int[size];
        System.out.println("Input collection numbers:");
        collection[0] = keyboard.nextInt();
        int minim = collection[0];
        for (int i=1; i<size; i++) {
            collection[i] = keyboard.nextInt();
            if (collection[i] < minim) {
                minim = collection[i];
            }
        }
        System.out.println("The smallest number is:" + minim);
    }
}
