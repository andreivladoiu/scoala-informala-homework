package ro.sci.tema1;
import java.util.Scanner;

/**
 *Main class
 */
public class MainClass {
    public static void main(String args[]) {

		System.out.println("1. Calculate the sum of the first 100 numbers higher than 0.");
		System.out.println("2. Display the smallest number from a collection of numbers.");
		System.out.println("3. Display the max digit from a number. Read the number from keyboard.");
		System.out.println("4. Check if a number is a palindrome.");
		System.out.println("5. Display all the prime numbers lower than a given number.");
		System.out.println("6. Input the dimensions of a rectangle and display area and perimeter.");
		System.out.println("7. Input the length of the side of a square, and display its area. Produce an error message if the length is negative.");
		System.out.println("8. Input 3 numbers, and display the biggest.");
		System.out.println("9. Input 2 values: start and finish, then display the numbers from start to finish.");
		System.out.println("10. Read number n and print the first n numbers in Fibonacci sequence.");
		System.out.println("11. Write pseudo code that will perform the following:");
		System.out.println("a) Read in 5 separate numbers.");
		System.out.println("b) Calculate the average of the five numbers.");
		System.out.println("c) Find the smallest (minimum) and largest (maximum) of the five entered numbers.");
		System.out.println("d) Write out the results found from steps b and c with a message describing what they are.");


		Scanner keyboard = new Scanner(System.in);
        	System.out.println("Input exercise number:");



        int number = keyboard.nextInt();
        switch(number) {
            case 1 : 
		Sum sum = new Sum ();
        	sum.add ();
		break;
            case 2 :
		Min min = new Min ();
        	min.find ();
		break;
	    case 3 :
		MaxDigit max = new MaxDigit ();
        	max.find ();
		break;
	    case 4 :
		Palindrom palindrom = new Palindrom ();
        	palindrom.check ();
		break;
	    case 5 :
		PrimeNumbers prime = new PrimeNumbers ();
       		prime.check ();
		break;
	    case 6 :
		Rectangle rectangle = new Rectangle ();
        	rectangle.calculate ();
		break;
	    case 7 : 
            	Square square = new Square ();
        	square.calculate ();
		break;
	    case 8 :
		Biggest biggest = new Biggest ();
        	biggest.max ();
		break;
	    case 9 :
		Interval interval = new Interval ();
        	interval.display ();
		break;
	    case 10 :
		Fibonacci fibonacci = new Fibonacci ();
       		fibonacci.listArray ();
		break;
	    case 11 :
		Numbers numbers = new Numbers ();
        	numbers.calculate ();
		break;
            default :
		System.out.println("There is no such exercise number");
                break;
	}
    }
}



