// Class: CS 1301/14
// Term: Fall 2017
// Instructor: Kihumba Ndiritu
// Name: Amir Davis
// Assignment: 2

import java.util.Scanner;

public class Practice_2_4 {
   public static void main(String[] args) {
   //create a scanner
   Scanner input = new Scanner(System.in);
   
   //Receive amount
   System.out.print("Enter an amount in double: ");
   double amount = input.nextDouble();
   
   int remainingAmount = (int)(amount * 100);
   
   //Find the number of dollars
   int numberOfDollars = remainingAmount / 100;
   remainingAmount = remainingAmount % 100;
   
   int numberOfQuaters = remainingAmount / 25;
   remainingAmount = remainingAmount % 25;
   
   int numberOfDimes = remainingAmount / 10;
   remainingAmount = remainingAmount % 10;
   
   int numberOfNickels = remainingAmount / 5;
   remainingAmount = remainingAmount % 5;
   
   int numberOfPennies = remainingAmount;
   
   System.out.println("Your amount of $" + amount + " consists of");
   System.out.println(" " + numberOfDollars + " dollars");
   System.out.println(" " + numberOfQuaters + " quarters");
   System.out.println(" " + numberOfDimes + " dimes");
   System.out.println(" " + numberOfNickels + " nickels");
   System.out.println(" " + numberOfPennies + " pennies");
}
}