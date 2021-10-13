package FatimahTanjeemSabiha;

public class Cricket extends Sports{
    /*
       Name    : Fatimah Tanjeem Sabiha
       ID      : 2012020146
       Section : C
       Batch   : 53rd
       Email   : cse_2012020146@lus.ac.bd
       Date    : 10.09.2021
    */
    String matchType;
    int over;
    Player player;
    Cricket(String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display()
    {
        System.out.println("Match Type: " +matchType);
        System.out.println("Over: " +over);
        System.out.println("Player Name: " +player.playerName);
        System.out.println("Jersey Number: " +player.jerseyNumber);
    }
}
