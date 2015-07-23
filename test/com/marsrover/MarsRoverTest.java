package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MarsRoverTest {

    @Test
    public void whenStartsAtZeroZeroAndFacingNorthShouldReturnZeroZeroAndNorthWhenNoMoveOperationSpecified() {
        MarsRover rover = new MarsRover(0,0,'N',"LLL");

        MarsRover finalPosition = rover.move();

        assertEquals("0 0 N", finalPosition.toString());
    }

    @Test
    public void whenStartsAtZeroZeroAndFacingSouthShouldReturnZeroZeroAndSouthWhenNotPossibleToMoveInSouthDirection() {
        MarsRover rover = new MarsRover(0,0,'S',"MMLRM");

        MarsRover finalPosition = rover.move();

        assertEquals("0 0 S", finalPosition.toString());

    }

    @Test
    public void whenStartsAtOneTwoAndFacingNorthShouldReturnOneTwoAndFacingWestWhenOperationSpecifiedIsLeft() {
        MarsRover rover = new MarsRover(1,2,'N',"L");

        MarsRover finalPosition = rover.move();

        assertEquals("1 2 W", finalPosition.toString());
    }

    @Test
    public void whenStartsAtThreeAndFourAndFacingNorthShouldReturnThreeFourAndFacingEastWhenOperationSpecifiedIsRight() {
        MarsRover rover = new MarsRover(3,4,'N',"R");

        MarsRover finalPosition = rover.move();

        assertEquals("3 4 E", finalPosition.toString());
    }
}

