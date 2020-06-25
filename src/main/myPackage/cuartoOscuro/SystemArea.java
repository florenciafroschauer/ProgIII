package myPackage.cuartoOscuro;

import java.util.Scanner;

public class SystemArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los nombres de los cinco partidos: ");
        String candidate1 = scanner.nextLine();
        String candidate2 = scanner.nextLine();
        String candidate3 = scanner.nextLine();
        String candidate4 = scanner.nextLine();
        String candidate5 = scanner.nextLine();
        DarkRoom darkRoom = new DarkRoom(candidate1, candidate2, candidate3, candidate4, candidate5);
        VotingTable votingTable = new VotingTable();

        long start = System.currentTimeMillis();
        System.out.println("\n1. Ingresar una persona a la cola." +
                "\n2. Ingresar persona a cuarto oscuro." +
                "\n3. Sacar persona del cuarto oscuro." +
                "\n4. Reponer boletas." +
                "\n5. Finalizar y obtener informe.");
        int option = scanner.nextInt();
        while (option != 5) {
        System.out.println("\n1. Ingresar una persona a la cola." +
                "\n2. Ingresar persona a cuarto oscuro." +
                "\n3. Sacar persona del cuarto oscuro." +
                "\n4. Reponer boletas." +
                "\n5. Finalizar y obtener informe.");

            switch (option) {
                case 1: votingTable.receivePerson(new Person());
                case 2:
                    if (!darkRoom.isBusy() && !votingTable.getPersonQueue().isEmpty()) {
                        darkRoom.personEntrance(votingTable.leaveToVote());
                    }
                case 3:
                    if (darkRoom.isBusy()) {
                        votingTable.receiveVote(darkRoom.personDeparture());
                    }
                case 4: darkRoom.replenishBallot();
            }
            option = scanner.nextInt();
        }

        long stop = System.currentTimeMillis();
        System.out.println("\nTiempo medio de espera en la cola: " + votingTable.meanTime() +
                "\nPartido ganador: " + "" + " cantidad de votos: " +
                "\nInformacion de las ultimas 10 boletas: ");
                 votingTable.reportLastVotes();
        System.out.println("\nTiempo medio de espera dentro del cuarto oscuro: " + darkRoom.meanTime());
    }
}
