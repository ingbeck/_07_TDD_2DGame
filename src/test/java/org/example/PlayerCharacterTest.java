package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    void getX_whenGameStart_thenReturn0(){

        //GIVEN
        int expected = 0;

        //WHEN
        int actual = PlayerCharacter.getX();

        //THEN
        assertEquals(expected, actual);

    }

    @Test
    void getY_whenGameStart_thenReturn0(){

        //GIVEN
        int expected = 0;

        //WHEN
        int actual = PlayerCharacter.getY();

        //THEN
        assertEquals(expected, actual);

    }

    @Test
    void move_whenWIsPressed_thenMove1StepUp(){

        //GIVEN
        String key = "w";
        int expected = PlayerCharacter.getY() + 1;
        //WHEN
        int actual = PlayerCharacter.move(key);
        //THEN
        assertEquals(expected, actual);

    }

    @Test
    void move_whenSIsPressed_thenMove1StepDown(){

        //GIVEN
        String key = "s";
        int expected = PlayerCharacter.getY() - 1;
        //WHEN
        int actual = PlayerCharacter.move(key);
        //THEN
        assertEquals(expected, actual);

    }

    @Test
    void move_whenAIsPressed_thenMove1StepLeft(){

        //GIVEN
        String key = "a";
        int expected = PlayerCharacter.getX() - 1;
        //WHEN
        int actual = PlayerCharacter.move(key);
        //THEN
        assertEquals(expected, actual);

    }

    @Test
    void move_whenDIsPressed_thenMove1StepRight(){

        //GIVEN
        String key = "d";
        int expected = PlayerCharacter.getX() + 1;
        //WHEN
        int actual = PlayerCharacter.move(key);
        //THEN
        assertEquals(expected, actual);

    }

}