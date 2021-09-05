package za.co.span;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateRankingTest {

    private static CalculateRanking calculateRanking = new CalculateRanking();
     private static Teams team1  = new Teams();
     private static Teams team2 = new Teams();


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void calculatePointsTest() {

        calculateRanking.calculatePoints("Lions",3,"Snakes",3);
        calculateRanking.calculatePoints("Tarantulas",1,"FC Awesome",0);
        calculateRanking.calculatePoints("Lions",1,"FC Awesome",1);
        calculateRanking.calculatePoints("Tarantulas",3,"Snakes",1);
        calculateRanking.calculatePoints("Lions",4,"Grouches",0);
        assertNotNull(calculateRanking.team1);
        assertNotNull(calculateRanking.team2);

        System.out.println(calculateRanking.addingTeamsPointToList());


    }
}