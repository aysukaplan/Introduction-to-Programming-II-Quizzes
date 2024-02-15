import java.util.ArrayList;

public class IceHockey extends Sports{
    Sports sport = new Sports();
    ArrayList<String> Ih = sport.getIceHockey();
    ArrayList<String> IceHTeams = sport.teamFinder(Ih);

    public IceHockey(String name, String numberedPlay, String numberWon, String numberTie, String numberLost, String setAgainst, String setFor, String totalPoint) {
        super(name, numberedPlay, numberWon, numberTie, numberLost, setAgainst, setFor, totalPoint);

    }

    // Using Polymorphism
    public ArrayList<String> rankingFinder( ArrayList<String> Match, ArrayList<String> Teams) {
        return super.rankingFinder(3, Match, Teams);
    }

    public IceHockey() {
    }
}
