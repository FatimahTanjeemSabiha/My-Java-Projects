package FatimahTanjeemSabiha;

public class Main {
     /*
        Name    : Fatimah Tanjeem Sabiha
        ID      : 2012020146
        Section : C
        Batch   : 53rd
        Email   : cse_2012020146@lus.ac.bd
        Date    : 10.09.2021
     */

    public static void main(String[] args) {
        Player player = new Player("Shakib", 75);
        Cricket cricket = new Cricket("International match", 20, player);
        cricket.display();
        Football football = new Football();
    }
}
