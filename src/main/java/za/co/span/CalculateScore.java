/*
@Author : Liyabona Saki
@Version : 1.0
 */

package za.co.span;


import java.util.ArrayList;

public class CalculateScore {

    private int win;
    private int draw;
    private int loose;

    public CalculateScore(){

    }

    public CalculateScore(int win, int draw , int loose){
        this.win = win;
        this.draw = draw;
        this.loose = loose;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getLoose() {
        return loose;
    }

    public void setLoose(int loose) {
        this.loose = loose;
    }


    public int calculate(int score) throws RuntimeException{

        if(score == 3){
            this.setWin(3);
        }else if (score == 1){
            this.setDraw(1);
        }else if (score == 0){
            this.setLoose(0);
        }else {
            System.out.printf("No score provided ");
        };

        return score;
    }

}
