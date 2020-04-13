package tp4;

import exercise.DynamicStack;

import java.util.List;

public class HorseMovement {
    private List<DynamicStack<Coordinate>> currentPosition;
    private int pointer;

    public HorseMovement () {
        DynamicStack<Coordinate> tempStack = new DynamicStack<>();
        tempStack.push(new Coordinate(1,1));
        currentPosition.add(tempStack);
        pointer = 0;
    }

    public void next() {
        if (currentPosition.get(pointer).isEmpty()){
            currentPosition.remove(pointer);
            pointer--;
        }
        
        if (pointer < 3){ //solucionar que siempre imprima el mismo recorrido
            for (int i = pointer; i < 4; i++) {
                possibleMovement(currentPosition.get(pointer).peek());
            }
        }

        printPath();
        currentPosition.get(pointer).pop();



    }

    private void possibleMovement(Coordinate coordinate) {
        DynamicStack<Coordinate> dynamicStack = new DynamicStack<>();

        int X[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int Y[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

        for (int i = 0; i < 8; i++) {

            int x = coordinate.getX() + X[i];
            int y = coordinate.getY() + Y[i];
            Coordinate coordinate1 = new Coordinate(x,y);

            if (isValid(coordinate1)){
                dynamicStack.push(coordinate1);
            }
        }

        currentPosition.add(dynamicStack);
        pointer++;
    }

    private boolean isValid(Coordinate coordinate){
        return coordinate.getX() < 9 && coordinate.getX() > 0 && coordinate.getY() < 9
                && coordinate.getY() > 0;
    }

    private void printPath(){
        for (int i = 0; i < pointer; i++) {
            printCoordinate(currentPosition.get(i).peek());
        }

        printCoordinate(currentPosition.get(pointer).peek());

    }

    private void printCoordinate(Coordinate coordinate) {
        switch(coordinate.getX()){
            case 1:
                System.out.println("A" + coordinate.getY());
            break;

            case 2:
                System.out.println("B" + coordinate.getY());
            break;

            case 3:
                System.out.println("C" + coordinate.getY());
            break;

            case 4:
                System.out.println("D" + coordinate.getY());
            break;

            case 5:
                System.out.println("E" + coordinate.getY());
            break;

            case 6:
                System.out.println("F" + coordinate.getY());
            break;

            case 7:
                System.out.println("G" + coordinate.getY());
            break;

            case 8:
                System.out.println("H" + coordinate.getY());
            break;

        }
    }

}
