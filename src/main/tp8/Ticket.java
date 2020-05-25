package tp8;

/**
 *  @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer.
 */

public class Ticket {
    private int ticketNumber;
    private int timeInSeconds;

    public Ticket(int timeInSeconds) {
        ticketNumber = (int)(Math.random() * ((99999 - 10000)) + 10000);
        this.timeInSeconds = timeInSeconds;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public int getTimeInSeconds() {
        return timeInSeconds;
    }
}
