package tp8;

public class Passenger {
    private int timeInSeconds;

    public void sumTimeInSeconds(int timeInSeconds) {
        this.timeInSeconds += timeInSeconds;
    }

    public Passenger() {
        this.timeInSeconds = 0;
    }

    public int getTimeInSeconds() {
        return timeInSeconds;
    }

}
