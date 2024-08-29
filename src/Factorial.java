package Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number to find out it's factorial: ");
        int number = userInput.nextInt();
        int x = number - 1;
        int i = number;
        int factorial = i;
        while(x > 0){
            factorial *= x;
            i = factorial;
            x--;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
