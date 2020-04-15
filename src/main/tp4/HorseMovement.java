package tp4;

import exercise.DynamicStack;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer.
 */

public class HorseMovement {
    private List<DynamicStack<Coordinate>> currentPosition;
    private int pointer;

    public HorseMovement() {
        currentPosition = new ArrayList<>();
        DynamicStack<Coordinate> tempStack = new DynamicStack<>();
        tempStack.push(new Coordinate(1,1));
        currentPosition.add(tempStack);
        pointer = 0;
    }

    /**
     *  Prints the possible path from horse´s current position.
     */

    public void next(int index) {
        while (currentPosition.get(pointer).isEmpty()) {
            currentPosition.remove(pointer);
            pointer--;

            if (pointer == - 1) System.exit(0);
            currentPosition.get(pointer).pop();
        }

        if (pointer < index - 1) {
            for (int i = pointer; i < index - 1; i++) {
                possibleMovement(currentPosition.get(pointer).peek());
            }
        }

        printPath();
        currentPosition.get(pointer).pop();
    }

    /**
     *  Creates a stack with the horse´s possible movements.
     */

    private void possibleMovement(Coordinate coordinate) {
        DynamicStack<Coordinate> dynamicStack = new DynamicStack<>();

        int[] xMovement = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int[] yMovement = { 1, 2, 2, 1, -1, -2, -2, -1 };

        for (int i = 0; i < 8; i++) {

            int x = coordinate.getX() + xMovement[i];
            int y = coordinate.getY() + yMovement[i];
            Coordinate coordinate1 = new Coordinate(x, y);

            if (isValid(coordinate1)) {
                dynamicStack.push(coordinate1);
            }
        }

        currentPosition.add(dynamicStack);
        pointer++;
    }

    /**
     *  Checks if a movements is valid.
     */

    private boolean isValid(Coordinate coordinate) {
        for (int i = 0; i < pointer; i++) {
            if (currentPosition.get(i).peek().equals(coordinate)) {
                return false;
            }
        }

        return coordinate.getX() < 9 && coordinate.getX() > 0 &&
                coordinate.getY() < 9 && coordinate.getY() > 0;
    }

    /**
     *  Defines how a path is printed.
     */

    private void printPath() {
        for (int i = 0; i < pointer; i++) {
            printCoordinate(currentPosition.get(i).peek());
        }

        printCoordinate(currentPosition.get(pointer).peek());
    }

    /**
     *  Defines how a coordinate is printed.
     */

    private void printCoordinate(Coordinate coordinate) {
        switch (coordinate.getX()) {
            case 1:
                System.out.print("A" + coordinate.getY()+ " ");
            break;

            case 2:
                System.out.print("B" + coordinate.getY() + " ");
            break;

            case 3:
                System.out.print("C" + coordinate.getY() + " ");
            break;

            case 4:
                System.out.print("D" + coordinate.getY()+ " ");
            break;

            case 5:
                System.out.print("E" + coordinate.getY()+ " ");
            break;

            case 6:
                System.out.print("F" + coordinate.getY()+ " ");
            break;

            case 7:
                System.out.print("G" + coordinate.getY()+ " ");
            break;

            case 8:
                System.out.print("H" + coordinate.getY()+ " ");
            break;
        }
    }
}
