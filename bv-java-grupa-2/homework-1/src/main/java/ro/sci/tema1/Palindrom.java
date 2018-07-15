package ro.sci.tema1;
import java.util.Scanner;
/**
 *The code checks if a number is palindrom
 */
public class Palindrom {
    public void check () {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input number:");
        int number = keyboard.nextInt();
        boolean k=true;
        int[] a = new int[10]; //int data type has max 10 digits
        int n = 0;
        do {
            int digit = number % 10;
            a[n] = digit;
            number = (number - digit)/10;
            n = n + 1;
        } while (number != 0);
        if (n < 2) {
            System.out.println("The number has only one digit");
        } else {
            for (int i=0; i<n/2; i++) {
                if (a[i] != a[n-1-i]) {
                    k=false;
                    break;
                }
            }
            if (k==true) {
                System.out.println("The number is a palindrom");
            } else {
                System.out.println("The number is not a palindrom");
            }
        }
    }

}
