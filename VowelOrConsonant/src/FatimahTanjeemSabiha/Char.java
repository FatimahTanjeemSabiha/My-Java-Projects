package FatimahTanjeemSabiha;

import java.util.Scanner;

public class Char {

    public static void main(String[] args) {
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=sc.next( ).charAt(0);
        //char ch=sc.nextChar();
        switch(ch)
        {
            case 'a' :
            case 'e' :
            case 'i'  :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : i++;
        }
        if(i==1)
            System.out.println("The entered character "+ch+" is a vowel.");
        else
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("The entered character "+ch+" is a consonant.");
        else
            System.out.println("It is not an alphabet.");
    }
}
