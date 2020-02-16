package threads.exercices;

public class Bench {
    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized void takeASeat(String name) {
        if (availableSeats > 0) {
            System.out.println(name + " Taking a seat.");
            availableSeats--;
            System.out.println(name+" Free seats left " + availableSeats);
        } else {
            System.out.println(name + " There are no available seats. :(");
        }
    }
}
