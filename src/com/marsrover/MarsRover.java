package com.marsrover;

public class MarsRover {
    int xCoOrdinate,yCoOrdinate;
    char headingDirection;
    String movements;

    public MarsRover(int xCoOrdinate,int yCoOrdinate,char headingDirection ,String movements) {
        this.xCoOrdinate = xCoOrdinate;
        this.yCoOrdinate = yCoOrdinate;
        this.headingDirection = headingDirection;
        this.movements = movements;
    }

    public String move() {
        return "0,0,N";
    }
}
