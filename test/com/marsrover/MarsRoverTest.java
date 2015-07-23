package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MarsRoverTest {

    @Test

    public void shouldReturnItsInitialPointAndHeadingDirectionWhenNoMoveOperationsSpecified() {
        MarsRover rover = new MarsRover(0,0,'N',"LRLLR");

        String finalPosition = rover.move();

        assertEquals("0,0,N" ,finalPosition.toString());
    }

    @Test
    public void shouldReturnItsInitialPosiitonAndHeadingDirectionWhenNotAllowedToMove() {
        MarsRover rover = new MarsRover(0,0,'S',"MMLRM");

        String finalPosition = rover.move();

        assertEquals("0,0,S",finalPosition.toString());


    }
}
