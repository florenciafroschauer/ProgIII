package myPackage.cuartoOscuro;

import exercise.DynamicStack;

public class DarkRoom {
    private DynamicStack<Vote> candidate1;
    private Vote vote1;
    private DynamicStack<Vote> candidate2;
    private Vote vote2;
    private DynamicStack<Vote> candidate3;
    private Vote vote3;
    private DynamicStack<Vote> candidate4;
    private Vote vote4;
    private DynamicStack<Vote> candidate5;
    private Vote vote5;
    private boolean isBusy;
    private Person person;
    private int numberOfVoters;
    private int waitTime;

    public DarkRoom(String candidate1, String candidate2, String candidate3, String candidate4, String candidate5) {
        vote1 = new Vote(candidate1);
        vote2 = new Vote(candidate2);
        vote3 = new Vote(candidate3);
        vote4 = new Vote(candidate4);
        vote5 = new Vote(candidate5);
        this.candidate1 = new DynamicStack<>();
        this.candidate2 = new DynamicStack<>();
        this.candidate3 = new DynamicStack<>();
        this.candidate4 = new DynamicStack<>();
        this.candidate5 = new DynamicStack<>();
        isBusy = false;
        numberOfVoters = 0;
        waitTime = 0;
        replenishBallot();
    }

    // Se reponen las boletas de todas las pilas.
    public void replenishBallot() {
        for (int i = 0; i < 200; i++) {
            candidate1.push(vote1);
        }

        for (int i = 0; i < 200; i++) {
            candidate2.push(vote2);
        }

        for (int i = 0; i < 200; i++) {
            candidate3.push(vote3);
        }

        for (int i = 0; i < 200; i++) {
            candidate4.push(vote4);
        }

        for (int i = 0; i < 200; i++) {
            candidate5.push(vote5);
        }
    }

    // Ingresa una persona, elige una boleta, si la pila no tiene boletas,
    // prueba 10 veces hasta que alguna pila tenga boletas.
    public void personEntrance(Person person) {
        isBusy = true;
        numberOfVoters++;
        person.setAdmissionTimeInDarkRoom(System.currentTimeMillis());
        this.person = person;
        int i = 0;
        while(i != 10) {
            int voteNumber = person.chooseVote(vote1, vote2, vote3, vote4, vote5);
            switch (voteNumber) {
             case 1:
                 if (!candidate1.isEmpty()) candidate1.pop();
             case 2:
                 if (!candidate2.isEmpty()) candidate2.pop();
             case 3:
                 if (!candidate3.isEmpty()) candidate3.pop();
             case 4:
                 if (!candidate4.isEmpty()) candidate4.pop();
             case 5:
                 if (!candidate5.isEmpty()) candidate5.pop();
            }
            i++;
        }
    }

    // La persona sale del cuarto oscuro y entrega su voto.
    public Vote personDeparture() {
        isBusy = false;
        person.setDepartureTimeOfDarkRoom(System.currentTimeMillis());
        waitTime += person.getTimeInDarkRoom();
        return person.deliverVote();
    }

    public double meanTime() {
        return (double)waitTime/numberOfVoters;
    }

    public boolean isBusy() {
        return isBusy;
    }
}
