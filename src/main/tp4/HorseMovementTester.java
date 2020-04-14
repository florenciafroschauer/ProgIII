package tp4;

import java.util.Scanner;

public class HorseMovementTester {
    public static void main(String[] args) {

        HorseMovement testHorseMovement = new HorseMovement();
        Scanner scanner = new Scanner(System.in);

        testHorseMovement.next();
        System.out.println("\n\n1) Next \n2) Exit");
        int value = scanner.nextInt();

        while(value != 2){
            testHorseMovement.next();
            System.out.println("\n\n1) Next \n2) Exit");
            value = scanner.nextInt();
        }


    }
}
