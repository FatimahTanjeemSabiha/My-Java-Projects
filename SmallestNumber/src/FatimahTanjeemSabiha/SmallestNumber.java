package FatimahTanjeemSabiha;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {
        int num1, num2, num3, result, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        num2 = scanner.nextInt();
        System.out.println("Enter the third number:");
        num3 = scanner.nextInt();
        scanner.close();
        temp = num1 < num2 ? num1:num2;
        result = num3 < temp ? num3:temp;
        System.out.println("The smallest number is:"+result);
    }
}
