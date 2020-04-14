package tp4;

import java.util.Scanner;

/**
 * @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer.
 */

public class HorseMovementTester {
    public static void main(String[] args) {

        HorseMovement testHorseMovement = new HorseMovement();
        Scanner scanner = new Scanner(System.in);

        testHorseMovement.next();
        System.out.println("\n\n1) Next path \n2) Exit");
        int value = scanner.nextInt();

        while(value != 2) {
            testHorseMovement.next();
            System.out.println("\n\n1) Next path \n2) Exit");
            value = scanner.nextInt();
        }
    }
}
