package FatimahTanjeemSabiha;

import java.util.Scanner;

public class Main {

      /*
        Name    : Fatimah Tanjeem Sabiha
        ID      : 2012020146
        Section : C
        Batch   : 53rd
        Email   : cse_2012020146@lus.ac.bd
        Date    : 16.10.2021
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AdvancedArithmetic advancedArithmetic = new MyCalculator();

        int n, N;

        System.out.print("Enter a number which is between 100: ");
        n = input.nextInt();

        while(n>100)
        {
            System.out.println("Try again.Number is not valid");
            System.out.println();
            System.out.print("Enter a number which is between 100: ");
            n = input.nextInt();
        }

        System.out.println("Sum of the divisors of "+n+": "+advancedArithmetic.divisorSum(n));

        System.out.println();

        System.out.print("Enter a number which is between 50: ");
        N = input.nextInt();

        while(N>50)
        {
            System.out.println("Try again.Number is not valid");
            System.out.println();
            System.out.print("Enter a number which is between 50: ");
            N = input.nextInt();
        }

        System.out.println("Factorial of "+N+": "+advancedArithmetic.findFactorial(N));
    }

}