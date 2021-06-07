/*
 *   UCF COP3330 SUMMER 2021 ASSIGNMENT 12 SOLUTION
 *   COPYRIGHT 2021 RAYME PERSAD
 */

/*Create a program that computes simple interest.
Prompt for the principal amount, the rate as a percentage, and the time, and display the amount accrued (principal + interest).
The formula for simple interest is A = P(1 + rt), where P is the principal amount, r is the annual rate of interest, t is the number of years the amount is invested, and A is the amount at the end of the investment.
 */

package org.example;
import java.util.Scanner;

public class practiceexample12 {
    Scanner in = new Scanner(System.in);

       System.out.print("Enter the principal: "); //prompt for principal input
        double p = in.nextDouble();

       System.out.print("Enter the rate of interest: "); // prompt for rate input
        double r = in.nextDouble();

       System.out.print("Enter the number of years: "); //prompt for years as input
        double t = in.nextDouble();

        double A = p*(1 +(r*t)/100); //simple interest formula

        int y=(int)t; //print year w/o decimal

        int si = (int)A; //print interest w/o decimal

       System.out.println("After "+y+" years at "+r+"%, the investment will be worth $"+si+"."); //print results
}

}
