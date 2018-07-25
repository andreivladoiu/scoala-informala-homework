package ro.sci.tema1;

/**
 *The code calculates the sum of the first 100 numbers higher than 0
 */
public class Sum {

    public void add() {
        int s = 0;
        int i;
        for (i = 1; i <= 100; i++) {
            s = s + i;
        }
        System.out.println("The sum is:" + s);
    }
}