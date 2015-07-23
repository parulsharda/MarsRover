package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MarsRoverTest {

    @Test
    public void whenStartsAtZeroZeroAndFacingNorthShouldReturnZeroZeroAndNorthWhenNoMoveOperationSpecified() {
        MarsRover rover = new MarsRover(0,0,'N',"LLL");

        String finalPosition = rover.move();

        assertEquals("0,0,N" ,finalPosition.toString());
    }

    @Test
    public void whenStartsAtZeroZeroAndFacingSouthShouldReturnZeroZeroAndSouthWhenNotPossibleToMoveInSouthDirection() {
        MarsRover rover = new MarsRover(0,0,'S',"MMLRM");

        String finalPosition = rover.move();

        assertEquals("0,0,S", finalPosition.toString());

    }

    @Test
    public void whenStartsAtOneTwoAndFacingNorthshouldReturnOneTwoAndFacingWestWhenOperationSpecifiedIsLeft() {
        MarsRover rover = new MarsRover(1,2,'N',"L");

        String finalPosition = rover.move();

        assertEquals("0,0,W", finalPosition.toString());
    }
}

