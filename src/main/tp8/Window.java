package tp8;

import exercise.DynamicQueue;
import exercise.DynamicStack;
/**
 *  @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer.
 */

public class Window {
    private int amount;
    private DynamicQueue<Passenger> passengers;
    private DynamicStack<Ticket> tickets;

    public Window() {
        passengers = new DynamicQueue<>();
        tickets = new DynamicStack<>();
    }

    public void servePassenger() {
        double num = (Math.random() * 1);
        if (num > 0.5 && !passengers.isEmpty()) {
            Passenger passenger = passengers.dequeue();
            amount += 100;
            tickets.push(new Ticket(passenger.getTimeInSeconds()));
        }

        DynamicQueue auxQueue = new DynamicQueue();
        for (int i = 0; i < passengers.amount(); i++) {
            Passenger auxPassenger = passengers.dequeue();
            auxPassenger.sumTimeInSeconds(30);
            auxQueue.enqueue(auxPassenger);
        }
        passengers = auxQueue;
    }

    public void addPassenger(Passenger passenger) {
        passengers.enqueue(passenger);
    }

    public DynamicStack<Ticket> getTickets() {
        return tickets;
    }

    public int getAmount() {
        return amount;
    }

    public DynamicQueue<Passenger> getPassengers() {
        return passengers;
    }
}
