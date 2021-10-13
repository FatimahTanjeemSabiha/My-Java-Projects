package FatimahTanjeemSabiha;

public class Main {
     /*
        Name    : Fatimah Tanjeem Sabiha
        ID      : 2012020146
        Section : C
        Batch   : 53rd
        Email   : cse_2012020146@lus.ac.bd
        Date    : 07.08.2021
     */

    public static void main(String[] args)
    {
        Student st1 = new Student();
        Student.universityName="Leading University";

        Student st2 = new Student("Fatimah Tanjeem Sabiha");
        Student st3 = new Student (2012020146);
        st1.display();
    }
    }

