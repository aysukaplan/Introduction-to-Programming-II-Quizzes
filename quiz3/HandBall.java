import java.util.ArrayList;

public class HandBall extends Sports {
    Sports sport1 = new Sports();
    ArrayList<String> Hb = sport1.getHandBall();
    ArrayList<String> HandBallTeams = sport1.teamFinder(Hb);

    public HandBall(String name, String numberedPlay, String numberWon, String numberTie, String numberLost, String setFor, String setAgainst, String totalPoint) {
        super(name, numberedPlay, numberWon, numberTie, numberLost, setFor, setAgainst, totalPoint);

    }

    public HandBall() {
    }
    //Using Polymorphism
    public ArrayList<String> rankingFinder(ArrayList<String> Match, ArrayList<String> Teams) {
        return super.rankingFinder(2, Match, Teams);
    }
}
