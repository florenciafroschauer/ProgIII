package myPackage.cuartoOscuro;

import exercise.DynamicList;
import exercise.DynamicQueue;

public class VotingTable {
    private DynamicQueue<Person> personQueue;
    private DynamicList<Vote> votes;
    private int numberOfVoters;
    private int waitTime;

    public VotingTable() {
        personQueue = new DynamicQueue<>();
        votes = new DynamicList<>();
        numberOfVoters = 0;
        waitTime = 0;
    }

    // Una persona empieza a hacer fila para ingresar a votar,
    // comienza a correr el tiempo de ingreso a la mesa.
    public void receivePerson(Person person) {
        personQueue.enqueue(person);
        person.setAdmissionTimeInVotingTable(System.currentTimeMillis());
        numberOfVoters++;
    }

    // Una persona sale de la cola e ingresa al cuarto oscuro,
    // termina su tiempo en la mesa.
    public Person leaveToVote() {
        Person person = personQueue.dequeue();
        person.setDepartureTimeOfVotingTable(System.currentTimeMillis());
        waitTime += person.getTimeInVotingTable();
        return person;
    }

    // Cuando una persona sale del cuarto oscuro entrega su voto en la mesa.
    public void receiveVote(Vote vote) {
        votes.insertNext(vote);
    }

    // Informa el ID y nombre del partido de los ultimos 10 votos.
    public void reportLastVotes() {
        votes.goTo(votes.size() - 9);
        for (int i = votes.getActualPosition(); i <= votes.size(); i++) {
            System.out.println("\nVote ID: " + votes.getActual().getId() +
                    ". Vote candidate: " + votes.getActual().getCandidateName());
        }
    }
    /**

    public int countVotes() {
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        votes.goTo(0);
        recount(v1);
        recount(v2);
        recount(v3);
        recount(v4);
        recount(v5);
        int max1 = Math.max(v1, v2);
        int max2 = Math.max(v2, v3);
        int max3 = Math.max(max1, max2);
        return Math.max(v5, max3);

    }

    private void recount(int v) {
        String candidate = votes.getActual().getCandidateName();
        for (int i = 0; i < votes.size(); i++) {
            votes.goTo(i);
            if (votes.getActual().getCandidateName().equals(candidate)) {
                v++;
                votes.remove();
            }
        }
    }
    */

    public double meanTime() {
        return (double)waitTime/numberOfVoters;
    }

    // Devuelve la cola de personas en la mesa de votacion
    public DynamicQueue<Person> getPersonQueue() {
        return personQueue;
    }

    // Devuelve los votos de la "urna"
    public DynamicList<Vote> getVotes() {
        return votes;
    }
}
