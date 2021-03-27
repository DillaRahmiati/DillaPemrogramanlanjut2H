package org.conditionalsandloops;
import java.util.Scanner;

//Loan CalculatorLoan Calculator
    public class Program {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();

            int payment = (amount * 271)/1000;
            int remaining = amount - payment;

            System.out.println(remaining);
        }
    }
