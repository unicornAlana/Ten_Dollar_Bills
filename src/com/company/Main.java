package com.company;

import java.util.Scanner;

public class Main {

         public static void main(String[] args) {
             Scanner input = new Scanner(System.in);

             System.out.println("Enter an amount of money as a decimal (dollars.cents) plz");
             double startNum = input.nextDouble();
             int roundUp = (int)(startNum + 10);
             int divRound = roundUp/10;
             int kindaDone = divRound*10;
             double leftOver = (kindaDone-startNum);
             leftOver = Math.round(leftOver * 100.0)/100.0;
             System.out.println("You can pay this amount with " + divRound + " $10 bills.");
             System.out.println("Your change back will be $" + leftOver + ".");


    }
}
