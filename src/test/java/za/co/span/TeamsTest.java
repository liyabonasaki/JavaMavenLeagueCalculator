package za.co.span;
/*
 Author : Liyabona Saki
 Description : These are basic test for our POJO class
 */


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class TeamsTest {


    private Teams team1 = new Teams();
    private Teams team2 = new Teams();


    @BeforeEach
    void setUp() {
        Teams team1;
        Teams team2;

    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void setName() throws Exception{
        System.out.println("============ TEST TO SET NAMES ============  ");
        try{
            team1.setName("Lions");
            team2.setName("Snakes");
            System.out.println("Succesful set names ");
            assertNotNull(team1,"cannot be null");
            assertNotNull(team2,"cannot be null");

        }catch(Exception e){
            e.getStackTrace();

        }

    }

    @Test
    void getName() throws Exception{
        System.out.println("============ TEST TO GET NAMES ============  ");

        setName();

        System.out.println(team1.getName());
        System.out.println(team2.getName());
        assertNotNull(team1.getName(),"Team needs to have a name");
        assertNotNull(team2.getName(),"Team needs to have a name");

    }

    @Test
    void setGoals() {
        System.out.println("============ TEST TO SET GOALS ============  ");
        try{
            team1.setPoints(3);
            team2.setPoints(3);
            System.out.println("Succesful set goals ");
            assertNotNull(team1,"cannot be null");
            assertNotNull(team2,"cannot be null");

        }catch(Exception e){
            e.getStackTrace();

        }

    }

    @Test
    void getGoals() {
        System.out.println("============ TEST TO GET GOALS ============  ");
        setGoals();

        System.out.println(team1.getPoints());
        System.out.println(team2.getPoints());
        assertNotNull(team1.getPoints(),"Team needs to have a goal");
        assertNotNull(team2.getPoints(),"Team needs to have a goal");
    }



    @Test
    void testToString() {
        team1.setName("Lions");
        team1.setPoints(3);
        team1.toString();

    }
}