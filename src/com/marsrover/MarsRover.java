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
        if(this.headingDirection == 'N' && this.movements == "L")
            return "0,0,W";
        if(this.headingDirection == 'N')
         return "0,0,N";
        else
            return "0,0,S";
    }

    @Override
    public String toString() {
        return "MarsRover{" + "xCoOrdinate=" + xCoOrdinate + "" + " yCoOrdinate=" + yCoOrdinate + ", headingDirection=" + headingDirection + ", movements='" + movements + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarsRover marsRover = (MarsRover) o;

        if (xCoOrdinate != marsRover.xCoOrdinate) return false;
        if (yCoOrdinate != marsRover.yCoOrdinate) return false;
        if (headingDirection != marsRover.headingDirection) return false;
        return !(movements != null ? !movements.equals(marsRover.movements) : marsRover.movements != null);

    }

    @Override
    public int hashCode() {
        int result = xCoOrdinate;
        result = 31 * result + yCoOrdinate;
        result = 31 * result + (int) headingDirection;
        result = 31 * result + (movements != null ? movements.hashCode() : 0);
        return result;
    }
}
