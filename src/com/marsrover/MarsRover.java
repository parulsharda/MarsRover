package com.marsrover;

public class MarsRover {
    int xCoOrdinate, yCoOrdinate;
    char headingDirection;
    String movements;

    public MarsRover(int xCoOrdinate, int yCoOrdinate, char headingDirection, String movements) {
        this.xCoOrdinate = xCoOrdinate;
        this.yCoOrdinate = yCoOrdinate;
        this.headingDirection = headingDirection;
        this.movements = movements;
    }

    public MarsRover move() {
        if (this.headingDirection == 'N' && this.movements == "L") {
            this.headingDirection = 'W';
            return new MarsRover(this.xCoOrdinate, this.yCoOrdinate, this.headingDirection, this.movements);
        }
        if (this.headingDirection == 'N' && this.movements == "R") {
            this.headingDirection = 'E';
            return new MarsRover(this.xCoOrdinate, this.yCoOrdinate, this.headingDirection, this.movements);
        }
        if (this.headingDirection == 'E' && this.movements == "R") {
            this.headingDirection = 'S';
            return new MarsRover(this.xCoOrdinate, this.yCoOrdinate, this.headingDirection, this.movements);
        } else
            return new MarsRover(this.xCoOrdinate, this.yCoOrdinate, this.headingDirection, this.movements);
    }

    @Override
    public String toString() {
        return this.xCoOrdinate + " " + this.yCoOrdinate + " " + this.headingDirection;
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
