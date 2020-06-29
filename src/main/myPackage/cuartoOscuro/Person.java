package myPackage.cuartoOscuro;

public class Person {
    private long admissionTimeInVotingTable;
    private long departureTimeOfVotingTable;
    private long admissionTimeInDarkRoom;
    private long departureTimeOfDarkRoom;
    private Vote vote;

    // La persona elige una de las 5 boletas posibles, la guarda y devuelve el numero de boleta elegida.
    public int chooseVote(Vote vote1, Vote vote2, Vote vote3, Vote vote4, Vote vote5) {
        int voteNumber = (int) (Math.random() * (5 - 1)) + 1;
        switch (voteNumber) {
            case 1: vote = vote1;
            case 2: vote = vote2;
            case 3: vote = vote3;
            case 4: vote = vote4;
            case 5: vote = vote5;
        }

        return voteNumber;
    }

    // Entregar voto.
    public Vote deliverVote() {
        return vote;
    }

    // Devuelve tiempo en mesa de votacion.
    public long getTimeInVotingTable() {
        return departureTimeOfVotingTable - admissionTimeInVotingTable;
    }

    // Devuelve tiempo en cuarto oscuro.
    public long getTimeInDarkRoom() {
        return departureTimeOfDarkRoom - admissionTimeInDarkRoom;
    }

    public void setAdmissionTimeInVotingTable(long admissionTimeInVotingTable) {
        this.admissionTimeInVotingTable = admissionTimeInVotingTable;
    }

    public void setDepartureTimeOfVotingTable(long departureTimeOfVotingTable) {
        this.departureTimeOfVotingTable = departureTimeOfVotingTable;
    }

    public void setAdmissionTimeInDarkRoom(long admissionTimeInDarkRoom) {
        this.admissionTimeInDarkRoom = admissionTimeInDarkRoom;
    }

    public void setDepartureTimeOfDarkRoom(long departureTimeOfDarkRoom) {
        this.departureTimeOfDarkRoom = departureTimeOfDarkRoom;
    }
}
