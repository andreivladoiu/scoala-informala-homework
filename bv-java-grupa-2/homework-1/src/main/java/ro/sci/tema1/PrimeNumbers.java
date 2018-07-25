package ro.sci.tema1;
import java.util.Scanner;
/**
 *The code displays all the prime numbers lower than a given number
 */
public class PrimeNumbers {
    public void check () {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input number:");
        int number = keyboard.nextInt();
        switch(number) {
            case 0 :
            case 1 : 
            case 2 :
                System.out.println("There are no lower prime numbers");
                break;
            default :
                int[] a = new int[number];
                a[0]=2;
                System.out.println(a[0]);
                int i=1;
                for (int n=3; n<number; n++) {
                    boolean k=true;
                    for (int j=0; j<i; j++) {
                        int remainder = n % a[j];
                        if (remainder==0) {
                            k=false;
                            break;
                        } else {
                            double ratio = n/a[j];
                            if (ratio<a[j]) {
                                break;
                            }
                        }
                    }
                    if (k==true) {
                        a[i]=n;
                        System.out.println(a[i]);
                        i = i + 1;
                    }
                }
        }
    }
}
