package ro.sci.tema1;
import java.util.Scanner;
/**
 *The code displays the max digit of a number
 */
public class MaxDigit {
    public void find () {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input number:");
        int number = keyboard.nextInt();
        int maxim = 0;
        do {
            int digit = number % 10;
            if (digit > maxim) {
                maxim = digit;
            }
            number = (number - digit)/10;
        } while (number !=0);
        System.out.println("The max digit is:" + maxim);
    }
}
