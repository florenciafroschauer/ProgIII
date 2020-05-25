package tp8;

import java.util.Scanner;

public class Simulation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero de ventanas : ");
        int numberOfWindows = scanner.nextInt();
        while (numberOfWindows < 5 || numberOfWindows > 25){
            System.out.println("Numero invalido");
            System.out.println("\nIngrese numero de ventanas : ");
            numberOfWindows = scanner.nextInt();
        }
        Metrovias metrovias = new Metrovias(numberOfWindows);

        System.out.println("\n1) Avanzar 30s" );
        int option = scanner.nextInt();
        while (option != 1){
            System.out.println("Opcion invalida");
            System.out.println("\n1) Avanzar 30s" );
            option = scanner.nextInt();
        }

        while(option != 2){
            metrovias.passengerArrival();
            metrovias.servePassenger();
            System.out.println("\n1) Avanzar 30s" + "\n2) Terminar Simulacion");
            option = scanner.nextInt();
        }

        System.out.println("\nTiempo medio de espera: " + metrovias.meanTime());
        System.out.println("\nMonto total: " + metrovias.totalAmount());

        metrovias.showStack();


    }
}
