package turtle;


import static turtle.Direction.*;
public class Turtle{

private Pen biro = new Pen();
private Direction currentDirection = EAST;
private Position currentPosition = new Position(0,0);

public boolean isPenUp() {
        return true;
        }

public boolean isPenDown() {
        return biro.isDown();
        }

public void penDown() {
        biro.penDown();
        }

public void penUp() {
        biro.penUp();
        }

public Direction getCurrentDirection() {
        return currentDirection;
        }

public void turnRight() {
        if(currentDirection == EAST) {currentDirection = SOUTH;
        }else if(currentDirection == SOUTH) {currentDirection = WEST;
        }else if(currentDirection == WEST) {currentDirection = NORTH;
        }else if(currentDirection == NORTH) {currentDirection = EAST;}
        }

public void turnLeft() {
        if(currentDirection == EAST) {currentDirection = NORTH;
        }else if(currentDirection == NORTH) {currentDirection = WEST;
        }else if(currentDirection == WEST) {currentDirection = SOUTH;
        }else if(currentDirection == SOUTH) {currentDirection = EAST;}
        }

public void move(int noOfSteps, SketchPad sketchPad) {
        if (isPenDown() == true) {
                if (currentDirection == EAST) writeOnColumn(noOfSteps, sketchPad);
        }
                if (currentDirection == EAST) increaseColumnBy(noOfSteps);
                if (currentDirection == SOUTH) increaseRowBy(noOfSteps);


}

private void writeOn(int noOfSteps, SketchPad sketchPad) {
        if(currentDirection == EAST) writeOnColumn(noOfSteps, sketchPad);
        }

private void writeOnColumn(int noOfSteps, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        for (int i = column; i < column+noOfSteps; i++) {
        floor[row][i] = 1;
        }
        }



private void increaseRowBy(int noOfSteps) {
        int currentRowPosition = currentPosition.getRow();
        currentPosition.setRow(currentRowPosition + noOfSteps -1);
        }

private void increaseColumnBy(int noOfSteps) {
        int currentColumnPosition= currentPosition.getColumn();
        currentPosition.setColumn(currentColumnPosition+noOfSteps-1);
        }

public Position getCurrentPosition() {
        return currentPosition;
        }
        }