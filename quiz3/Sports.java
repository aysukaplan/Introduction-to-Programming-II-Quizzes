import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Sports {
    String name;
    String numberedPlay;
    String numberWon;
    String numberTie;
    String numberLost;
    String setAgainst;
    String setFor;
    String totalPoint;

    public Sports(String name, String numberedPlay, String numberWon, String numberTie, String numberLost, String setFor, String setAgainst, String totalPoint) {
        this.name = name;
        this.numberedPlay = numberedPlay;
        this.numberWon = numberWon;
        this.numberTie = numberTie;
        this.numberLost = numberLost;
        this.setAgainst = setAgainst;
        this.setFor = setFor;
        this.totalPoint = totalPoint;
    }

    public Sports() {
    }

    static ArrayList<String> IceHockey = new ArrayList<>();
    static ArrayList<String> HandBall = new ArrayList<>();

    public void read(String first) throws IOException {
        String thisLine;
        try (BufferedReader author = new BufferedReader(new FileReader(first))) {
            while ((thisLine = author.readLine()) != null) {
                if (!thisLine.endsWith(" ")) {
                    if (thisLine.startsWith("I")) {
                        IceHockey.add(thisLine);
                    }
                    if (thisLine.startsWith("H")) {
                        HandBall.add(thisLine);
                    }
                } else {
                    while (thisLine.endsWith(" ")) {
                        thisLine = thisLine.substring(0, thisLine.length() - 1);
                    }
                    if (thisLine.startsWith("I")) {
                        IceHockey.add(thisLine);
                    }
                    if (thisLine.startsWith("H")) {
                        HandBall.add(thisLine);
                    }

                }
            }
        }
    }


    public ArrayList<String> teamFinder(ArrayList<String> List) {
        ArrayList<String> teams = new ArrayList<>();
        for (String line : List) {
            String[] separate = line.split("\t");
            if (!teams.contains(separate[1])) {
                teams.add(separate[1]);
            }

            if (!teams.contains(separate[2])) {
                teams.add(separate[2]);
            }
        }
        return teams;
    }
    public String numberedPlayed(String team, String type){
        int number = 0;
        if (type.equals("IceHockey")) {
            for (String line : IceHockey) {
                String[] separate = line.split("\t");
                for (String word : separate) {
                    if (word.equals(team)) {
                        number++;
                    }
                }
            }
        }
        if (type.equals("HandBall")) {
            for (String line : HandBall) {
                String[] separate = line.split("\t");
                for (String word : separate) {
                    if (word.equals(team)) {
                        number++;
                    }
                }
            }
        }
        return String.valueOf(number);

    }
    public String numberWon(String team, String type) {
        int wonNumber = 0;
        if (type.equals("IceHockey")) {
            for (String line : IceHockey) {
                String[] separate = line.split("\t");
                if (separate[1].equals(team)) {
                    String[] separated = separate[3].split(":");
                    int add = Integer.parseInt(separated[0]);
                    int minus = Integer.parseInt(separated[1]);
                    if (add > minus) {
                        wonNumber++;
                    }
                }
                if (separate[2].equals(team)) {
                    String[] separated1 = separate[3].split(":");
                    int add = Integer.parseInt(separated1[1]);
                    int minus = Integer.parseInt(separated1[0]);
                    if (add > minus) {
                        wonNumber++;
                    }
                }
            }
        }
        if (type.equals("HandBall")) {
            for (String line : HandBall) {
                String[] separate = line.split("\t");
                if (separate[1].equals(team)) {
                    String[] separated = separate[3].split(":");
                    int add = Integer.parseInt(separated[0]);
                    int minus = Integer.parseInt(separated[1]);
                    if (add > minus) {
                        wonNumber++;
                    }
                }
                if (separate[2].equals(team)) {
                    String[] separated1 = separate[3].split(":");
                    int add = Integer.parseInt(separated1[1]);
                    int minus = Integer.parseInt(separated1[0]);
                    if (add > minus) {
                        wonNumber++;
                    }
                }
            }
        }
        return String.valueOf(wonNumber);


    }
    public String numberTie(String team, String type) {
        int tieNumber = 0;
        if (type.equals("IceHockey")) {
            for (String line : IceHockey) {
                String[] separate = line.split("\t");
                if (separate[1].equals(team) || (separate[2].equals(team))) {
                    String[] separated = separate[3].split(":");
                    int add = Integer.parseInt(separated[0]);
                    int minus = Integer.parseInt(separated[1]);
                    if (add == minus) {
                        tieNumber++;
                    }
                }
            }
        }
        if (type.equals("HandBall")) {
            for (String line : HandBall) {
                String[] separate = line.split("\t");
                if (separate[1].equals(team) ||  (separate[2].equals(team))) {
                    String[] separated1 = separate[3].split(":");
                    int add = Integer.parseInt(separated1[0]);
                    int minus = Integer.parseInt(separated1[1]);
                    if (add == minus) {
                        tieNumber++;
                    }
                }

            }
        }
        return String.valueOf(tieNumber);
    }
    public String numberLost(String team, String type) {
        int Number = 0;
        if (type.equals("IceHockey")) {
            for (String line : IceHockey) {
                String[] separate = line.split("\t");
                if (separate[1].equals(team)) {
                    String[] separated = separate[3].split(":");
                    int add = Integer.parseInt(separated[0]);
                    int minus = Integer.parseInt(separated[1]);
                    if (add < minus) {
                        Number++;
                    }
                }
                if (separate[2].equals(team)) {
                    String[] separated1 = separate[3].split(":");
                    int add = Integer.parseInt(separated1[1]);
                    int minus = Integer.parseInt(separated1[0]);
                    if (add < minus) {
                        Number++;
                    }
                }
            }
        }
        if (type.equals("HandBall")) {
            for (String line : HandBall) {
                String[] separate = line.split("\t");
                if (separate[1].equals(team)) {
                    String[] separated = separate[3].split(":");
                    int add = Integer.parseInt(separated[0]);
                    int minus = Integer.parseInt(separated[1]);
                    if (add < minus) {
                        Number++;
                    }
                }
                if (separate[2].equals(team)) {
                    String[] separated1 = separate[3].split(":");
                    int add = Integer.parseInt(separated1[1]);
                    int minus = Integer.parseInt(separated1[0]);
                    if (add < minus) {
                        Number++;
                    }
                }
            }
        }
        return String.valueOf(Number);


    }
    public String setFor(String team, String type) {
        int number = 0;
        if (type.equals("IceHockey")) {
            for (String line : IceHockey) {
                String[] separate = line.split("\t");
                if (separate[1].equals(team)) {
                    String[] separated = separate[3].split(":");
                    int add = Integer.parseInt(separated[0]);
                    number = number + add;
                }
                if (separate[2].equals(team)) {
                    String[] separated1 = separate[3].split(":");
                    int add = Integer.parseInt(separated1[1]);
                    number = number + add;
                }
            }
        }
        if (type.equals("HandBall")) {
            for (String line : HandBall) {
                String[] separate = line.split("\t");
                if (separate[1].equals(team)) {
                    String[] separated = separate[3].split(":");
                    int add = Integer.parseInt(separated[0]);
                    number = number + add;
                }
                if (separate[2].equals(team)) {
                    String[] separated1 = separate[3].split(":");
                    int add = Integer.parseInt(separated1[1]);
                    number = number + add;
                }
            }
        }
        return String.valueOf(number);
    }
    public String setAgainst(String team, String type) {
        int number = 0;
        if (type.equals("IceHockey")) {
            for (String line : IceHockey) {
                String[] separate = line.split("\t");
                if (separate[1].equals(team)) {
                    String[] separated = separate[3].split(":");
                    int add = Integer.parseInt(separated[1]);
                    number = number + add;
                }
                if (separate[2].equals(team)) {
                    String[] separated1 = separate[3].split(":");
                    int add = Integer.parseInt(separated1[0]);
                    number = number + add;
                }
            }
        }
        if (type.equals("HandBall")) {
            for (String line : HandBall) {
                String[] separate = line.split("\t");
                if (separate[1].equals(team)) {
                    String[] separated = separate[3].split(":");
                    int add = Integer.parseInt(separated[1]);
                    number = number + add;
                }
                if (separate[2].equals(team)) {
                    String[] separated1 = separate[3].split(":");
                    int add = Integer.parseInt(separated1[0]);
                    number = number + add;
                }
            }
        }
        return String.valueOf(number);
    }
    public String totalPoint(String team, String type) {
        int number = 0;
        int won = Integer.parseInt(numberWon(team,type));
        int tie = Integer.parseInt(numberTie(team,type));
        if (type.equals("IceHockey")) {
            number = (3 * won) + tie;
        }
        if (type.equals("HandBall")) {
            number = (2 * won) + tie;
        }
        return String.valueOf(number);


    }
    // Using Polymorphism
    public ArrayList<String> rankingFinder(int number,ArrayList<String> Match, ArrayList<String> Teams) {
        ArrayList<String> ranking = new ArrayList<>();
        ArrayList<Integer> keepScore = new ArrayList<>();
        ArrayList<Integer> keepAverage = new ArrayList<>();
        for (String team : Teams) {
            int score = 0;
            int average = 0;
            for (String line : Match) {
                String[] separate = line.split("\t");
                if (separate[1].equals(team)) {
                    String[] separated = separate[3].split(":");
                    int add = Integer.parseInt(separated[0]);
                    int minus = Integer.parseInt(separated[1]);
                    average = average + add - minus;
                    if (add > minus) {
                        score = score + number;
                    }
                    if (add == minus) {
                        score = score + 1;
                    }
                }
                if (separate[2].equals(team)) {
                    String[] separated1 = separate[3].split(":");
                    int add = Integer.parseInt(separated1[1]);
                    int minus = Integer.parseInt(separated1[0]);
                    average = average + add - minus;
                    if (add > minus) {
                        score = score + number;
                    }
                    if (add == minus) {
                        score = score + 1;
                    }
                }

            }
            keepScore.add(score);
            keepAverage.add(average);

        }
        int a = keepScore.size();
        while ( a != 0) {
            int number1 = 0;
            int max = Collections.max(keepScore);
            int i = keepScore.indexOf(max);
            ArrayList<Integer> keepIndex = new ArrayList<>();
            for (int c = 0 ; c< keepScore.size();c++) {
                if (keepScore.get(c) == max) {
                    keepIndex.add(c);
                    number1++;
                }
            }

            if (number1 == 1) {
                ranking.add(Teams.get(i));
                keepScore.set(i, -1);
                a--;
            }
            if (number1 > 1) {
                int b = number1;
                ArrayList<Integer> keepAverage1 = new ArrayList<>();
                for (int index : keepIndex) {
                    keepAverage1.add(keepAverage.get(index));
                }

                while (b != 0) {
                    int maxA = Collections.max(keepAverage1);
                    int u = keepAverage1.indexOf(maxA);

                    ranking.add(Teams.get(keepIndex.get(u)));
                    keepScore.set(keepIndex.get(u), -1);
                    keepAverage1.set(u, -1);
                    b--;
                    a--;

                }



            }

    }

        return ranking;
    }









    public ArrayList<String> getIceHockey() {
        return IceHockey;
    }

    public static void setIceHockey(ArrayList<String> iceHockey) {
        IceHockey = iceHockey;
    }

    public ArrayList<String> getHandBall() {
        return HandBall;
    }

    public static void setHandBall(ArrayList<String> handBall) {
        HandBall = handBall;
    }
}