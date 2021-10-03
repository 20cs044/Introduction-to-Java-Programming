/*
@author:-Devraj Parmar(20cs044)
Exercise05_22, you can enter any number and you get approximated square root by given formula
*/

/*
There are several techniques for implementing
the sqrt method in the Math class. One such technique is known as
the Babylonian method. It approximates the square root of a number, n, by repeatedly
performing a calculation using the following formula:

nextGuess = (lastGuess + n / lastGuess) / 2

When nextGuess and lastGuess are almost identical, nextGuess is
the approximated square root. The initial guess can be any positive value (e.g., 1).
This value will be the starting value for lastGuess. If the difference between
nextGuess and lastGuess is less than a very small number, such as 0.0001,
you can claim that nextGuess is the approximated square root of n.
If  not, nextGuess becomes lastGuess and the approximation process continues.
Implement the following method that returns the square root of n.
public static double sqrt(long n)
*/

import java.util.Scanner;

package Exercise05;

public class Exercise05_22 {

       public static void main(String []args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Enter a number: ");
       long number = input.nextLong();

       System.out.println("The approximated square root of " + number +" is: " + sqrt(number));
       }
       public static double sqrt(long n) {
       long lastGuess = 1;
       long nextGuess = (lastGuess + n / lastGuess) / 2;

       while(nextGuess - lastGuess > 0.0001) {
       lastGuess = nextGuess;
       nextGuess = (lastGuess + n / lastGuess) / 2;
       }
       lastGuess = nextGuess;
       return nextGuess = (lastGuess + n / lastGuess) / 2;
       }
}

/*
Output:-
Enter a number: 9
The approximated square root of 9 is: 3.0
*/
