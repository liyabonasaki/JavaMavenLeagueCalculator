/*
@Author : Liyabona Saki
@Version : 1.0
 */

package za.co.span;

public class Teams {
    private String name;
    private int points;
    private int goals;

    //default con
    public Teams(){

    }

    //parameterised con
    Teams(String name, int points ){
        this.name = name;
        this.points = points;


    }



    //encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGoals() {
        return goals;
    }

    public int setGoals(int goals) {
//        this.goals = goals;
        return goals;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }
}
