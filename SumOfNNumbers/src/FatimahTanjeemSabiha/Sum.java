package FatimahTanjeemSabiha;

import java.util.Scanner;

public class Sum
{
    public static void main(String[] args)
    {
        int n,sum=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter how many numbers you want to add: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the "+n+" numbers: ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter  number  "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        System.out.println("The sum of "+n+" numbers is: "+sum);
    }
}

