package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

abstract  public class Car {

    /** The position of the car on the grid */
    private Position pos = new Position();
    private boolean Crashed = false;
    private int currentDirection;
    private int timesMovedSinceLastTurn;
    private int speed;

    public Car(int speed) {
        this.speed = speed;
        this.currentDirection = (int) Math.floor(Math.random() * 4 +1);
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getTimesMovedSinceLastTurn() {
        return timesMovedSinceLastTurn;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void setTimesMovedSinceLastTurn(int timesMovedSinceLastTurn) {
        this.timesMovedSinceLastTurn = timesMovedSinceLastTurn;
    }


    public Position getPos() {
        return pos;
    }

    public void setCrashed(boolean crashed) {
        Crashed = crashed;
    }

    public boolean isCrashed() {
        return Crashed;
    }

    public double getSpeed() {
        return speed;
    }

    public String getPositionId() {
        Integer x = (Integer) this.pos.getCol();
        Integer y = (Integer) this.pos.getRow();

        return x.toString()+y.toString();
    }

    private void moveUp() {
        this.getPos().setRow(this.getPos().getRow() - 1);
    }

    private void moveDown() {
        this.getPos().setRow(this.getPos().getRow() + 1);
    }

    private void moveLeft() {
        this.getPos().setCol(this.getPos().getCol() - 1);
    }

    private void moveRight() {
        this.getPos().setCol(this.getPos().getCol() + 1);
    }

    public void move() {

        if(isCrashed()) {
            return;
        }

        if(timesMovedSinceLastTurn >= 3) {

            int random = (int) Math.floor(Math.random() * 3);

            switch (random) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    this.changeDirection();
                    break;
            }
        }

        switch (currentDirection) {
            case 1:
                this.moveUp();
                timesMovedSinceLastTurn++;
                break;
            case 2:
                this.moveRight();
                timesMovedSinceLastTurn++;
                break;
            case 3:
                this.moveDown();
                timesMovedSinceLastTurn++;
                break;
            case 4:
                this.moveLeft();
                timesMovedSinceLastTurn++;
            }

            int myCol = this.getPos().getCol();
        int myRow = this.getPos().getRow();

        if(myCol <= 1)  {
             currentDirection = 2;
             timesMovedSinceLastTurn = 0;
         }

        if(myCol >= Field.getWidth() - 1) {
            currentDirection = 4;
            timesMovedSinceLastTurn = 0;
        }

         if( myRow <= 1) {
             currentDirection = 3;
             timesMovedSinceLastTurn = 0;
         }

        if( myRow >= Field.getHeight() - 1) {
            currentDirection = 1;
            timesMovedSinceLastTurn = 0;
        }
    }


    private void changeDirection() {

        boolean isEven = this.currentDirection % 2 == 0;
        int random = (int) Math.floor(Math.random() * 2) ;

        if(isEven) {
            switch (random) {
                case 0:
                    currentDirection = 1;
                    timesMovedSinceLastTurn = 0;
                    break;
                case 1:
                    currentDirection = 3;
                    timesMovedSinceLastTurn = 0;
                    break;
            }

            return;
        }

        switch (random) {
            case 0:
                currentDirection = 2;
                timesMovedSinceLastTurn = 0;
                break;
            case 1:
                currentDirection = 4;
                timesMovedSinceLastTurn = 0;
                break;

        }
    }
}
