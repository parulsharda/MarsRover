package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MarsRoverTest {

    @Test

    public void shouldReturnItsInitialPointAndHeadingDirectionWhenNoOperationsSpecified() {
        MarsRover rover = new MarsRover(0,0,'N',"LRLLR");

        String finalPosition = rover.move();

        assertEquals("0,0,N" ,finalPosition); 
    }
}
