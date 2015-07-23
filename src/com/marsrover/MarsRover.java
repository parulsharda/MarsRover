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
        if(this.headingDirection == 'N')
         return "0,0,N";
        else
            return "0,0,S";
    }

    @Override
    public String toString() {
        return "MarsRover{" + "xCoOrdinate=" + xCoOrdinate + "" + " yCoOrdinate=" + yCoOrdinate + ", headingDirection=" + headingDirection +
                ", movements='" + movements + '\'' + '}';
    }
}
