package ro.sci.tema1;
import java.util.Scanner;
/**
 *The code reads number n and prints the first n numbers in Fibonacci sequence
 */
public class Fibonacci {
    public void listArray() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input number:");
        int n = keyboard.nextInt();
        switch (n) {
            case 0:
                System.out.println("Input a value higher than 0");
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(1);
                System.out.println(1);
                break;
            default:
                int[] a = new int[n];
                a[0] = 1;
                System.out.println(a[0]);
                a[1] = 1;
                System.out.println(a[1]);
                for (int i = 2; i < n; i++) {
                    a[i] = a[i - 1] + a[i - 2];
                    System.out.println(a[i]);
                }
        }
    }
}
