package tp8;

import exercise.DynamicList;
import exercise.DynamicStack;

public class Metrovias {
    private DynamicList<Window> windows;
    private DynamicStack<Ticket> tickets;

    public Metrovias(int numberOfWindows) {
        windows = new DynamicList<>();
        tickets = new DynamicStack<>();
        for (int i = 0; i < numberOfWindows; i++) {
            windows.insertNext(new Window());
        }
    }

    public void passengerArrival(){
        for (int i = 0; i < 5; i++) {
            int num  = (int)(Math.random() * ((windows.size())));
            windows.goTo(num);
            windows.getActual().addPassenger(new Passenger());
        }
    }

    public void servePassenger(){
        for (int i = 0; i < windows.size(); i++) {
            windows.goTo(i);
            windows.getActual().servePassenger();
            if (!windows.getActual().getTickets().isEmpty()) tickets.push(windows.getActual().getTickets().peek());
        }
    }

    public float meanTime(){
        int meanTime = 0;
        int counter = 0;
        DynamicStack<Ticket> auxStack = tickets;
        while(!auxStack.isEmpty()){
            meanTime += auxStack.peek().getTimeInSeconds();
            auxStack.pop();
            counter++;
        }
        return meanTime/counter;
    }

    public int totalAmount(){
        int totalAmount = 0;
        for (int i = 0; i < windows.size(); i++) {
            windows.goTo(i);
            totalAmount += windows.getActual().getAmount();
        }
        return totalAmount;
    }

    public void showStack(){
    }

    public DynamicList<Window> getWindows() {
        return windows;
    }

    public DynamicStack<Ticket> getTickets() {
        return tickets;
    }
}

