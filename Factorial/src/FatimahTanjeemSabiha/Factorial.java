package FatimahTanjeemSabiha;

import java.util.Scanner;

public class Factorial{

    public static void main(String[] args) {
        long n,fact=1;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:");

        n=sc.nextLong();
        int i=1;
        while(i<=n)
        {

            fact=fact*i;
            i++;
        }

        System.out.println("The required factorial is: "+fact);
    }
}
