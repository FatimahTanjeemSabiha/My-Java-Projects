package FatimahTanjeemSabiha;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new
                Scanner(System.in);
        System.out.println("Enter your section : ");
        String section = input.nextLine();

        Hobby myHobby = new Hobby();
        Info myDetails = new Info();

        System.out.println("Your section is : " + section);
        System.out.println("Your name is : " + myDetails.name);
        System.out.println("Your id is : " + myDetails.id);
        System.out.println("Your hobby is : " + myHobby.hobbyName);


    }
}
/*
    Name: Fatimah Tanjeem Sabiha
    ID: 2012020146
    Section: 5(C)
    Email: cse_2012020146@lus.ac.bd
    Date: 15/07/2021
 */
