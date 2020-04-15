package tp4;

import java.util.Scanner;

/**
 * @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer.
 */

public class HorseMovementTester {
    public static void main(String[] args) {

        HorseMovement testHorseMovement = new HorseMovement();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of movements: ");
        int index = scanner.nextInt();

        while (index > 42 || index < 0) {
            System.out.println("Invalid number\n");
            System.out.println("Enter number of movements: ");
            index = scanner.nextInt();
        }

        System.out.println();
        testHorseMovement.next(index);
        System.out.println("\n\n1) Next path \n2) Exit");
        int value = scanner.nextInt();

        while (value != 2) {
            testHorseMovement.next(index);
            System.out.println("\n\n1) Next path \n2) Exit");
            value = scanner.nextInt();
        }
    }
}
