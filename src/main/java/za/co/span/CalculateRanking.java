package za.co.span;

import java.util.ArrayList;

public class CalculateRanking {
    private int win = 3;
    private int draw = 1;
    private int loose = 0;

    ArrayList<Teams> teamsDB = new ArrayList<Teams>();
    CalculateScore cs = new CalculateScore();

    Teams team1 = new Teams();
    Teams team2 = new Teams();



    /*
       if a match is played and the score is the same we shall set the points to draw equivalent to 1 point
       else 1 team loose and 1 team wins
     */
    public void calculatePoints(String name1,int goal1, String name2, int goal2) {

        if (team1.setGoals(goal1) == team2.setGoals(goal2)){
            team1.setName(name1);
            team2.setName(name2);
            team1.setPoints(draw);
            team2.setPoints(draw);



        }
        else if (team1.setGoals(goal1) < team2.setGoals(goal2)){
            team1.setName(name1);
            team2.setName(name2);
            team1.setPoints(loose);
            team2.setPoints(win);


        }else if( team1.setGoals(goal1)> team2.setGoals(goal2)){
            team1.setName(name1);
            team2.setName(name2);
            team1.setPoints(win);
            team2.setPoints(loose);

        }
        addingTeamsPointToList();
    }



    public ArrayList<Teams> addingTeamsPointToList(){
        teamsDB.add(team1);
        teamsDB.add(team2);
        return teamsDB;
    }

}
