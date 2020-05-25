package tp8;

/**
 *  @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer.
 */

public class Passenger {
    private int timeInSeconds;

    public Passenger() {
        this.timeInSeconds = 0;
    }

    public void sumTimeInSeconds(int timeInSeconds) {
        this.timeInSeconds += timeInSeconds;
    }

    public int getTimeInSeconds() {
        return timeInSeconds;
    }
}
