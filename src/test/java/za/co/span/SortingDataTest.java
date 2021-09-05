/*
@Author : Liyabona Saki
@Version : 1.0
 */

package za.co.span;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortingDataTest {

    private static SortingData sd = new SortingData();
    private static Teams teams = new Teams();

    @BeforeEach
    void setUp() {
        SortingData sd;
        Teams teams;

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void compare() {
        if(teams == null)return;
        ArrayList<Teams> teams = new ArrayList<Teams>();

        Teams team1 = new Teams("Lions",5);
        Teams team2 = new Teams("Snakes",1);
        Teams team3 = new Teams("Tarantulas",6);
        Teams team4 = new Teams("FC Awesome",1);
        Teams team5 = new Teams("Groaches",0);

        teams.add(team1);
        teams.add(team2);
        teams.add(team3);
        teams.add(team4);
        teams.add(team5);

        for (Teams t : teams){
            assertNotNull(t);
        }

        Collections.sort(teams,new SortingData().reversed());


        for (Teams sortedData : teams) {
            assertNotNull(sortedData);
            System.out.println(sortedData);

        }

    }

}