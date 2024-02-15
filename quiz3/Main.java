import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Sports s = new Sports();
        HandBall h = new HandBall();
        IceHockey i = new IceHockey();
        s.read(args[0]);
        i.teamFinder(i.Ih);
        h.teamFinder(h.Hb);

        ArrayList<String> rankingHockey = i.rankingFinder(i.Ih,i.teamFinder(i.Ih));

        ArrayList<String> rankingHandBall = h.rankingFinder(h.Hb,h.teamFinder(h.Hb));

        try (FileWriter writer = new FileWriter("icehockey.txt", false);
             BufferedWriter bw = new BufferedWriter(writer)) {
            for (int a = 0 ; a< rankingHockey.size(); a++){
                String team = rankingHockey.get(a);
                String type = "IceHockey";
                IceHockey team1 = new IceHockey(team, s.numberedPlayed(team,type), s.numberWon(team,type),
                        s.numberTie(team,type), s.numberLost(team,type), s.setAgainst(team,type),
                        s.setFor(team,type), s.totalPoint(team,type)
                        );
                bw.append(String.format("%s.\t%s\t%s\t%s\t%s\t%s\t%s:%s\t%s\n",
                        String.valueOf(a+1), team1.name, team1.numberedPlay,team1.numberWon,
                        team1.numberTie, team1.numberLost, team1.setAgainst, team1.setFor,
                        team1.totalPoint));
            }
        }
        try (FileWriter writer = new FileWriter("handball.txt", false);
             BufferedWriter bw = new BufferedWriter(writer)) {
            for (int b = 0 ; b< rankingHandBall.size(); b++){
                String team = rankingHandBall.get(b);
                String type = "HandBall";
                HandBall team1 = new HandBall(team, s.numberedPlayed(team,type), s.numberWon(team,type),
                        s.numberTie(team,type), s.numberLost(team,type), s.setAgainst(team,type),
                        s.setFor(team,type), s.totalPoint(team,type)
                );
                bw.append(String.format("%s.\t%s\t%s\t%s\t%s\t%s\t%s:%s\t%s\n",
                        String.valueOf(b+1), team1.name, team1.numberedPlay,team1.numberWon,
                        team1.numberTie, team1.numberLost, team1.setAgainst, team1.setFor,
                        team1.totalPoint));
            }
        }


    }
}
