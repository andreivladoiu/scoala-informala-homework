package ro.sci.tema1;
import java.util.Scanner;
/**
 *The code inputs 2 values:  start  and  finish, then displays the numbers from start to finish
 */
public class Interval {
    public void display () {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input start:");
        int start = keyboard.nextInt();
        System.out.println("Input finish:");
        int finish = keyboard.nextInt();
        for (int i=start; i<=finish; i++) {
            System.out.println(i);
        }
    }
}
