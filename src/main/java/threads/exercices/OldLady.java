package threads.exercices;

public class OldLady extends Thread {
    private String name;
    private Bench bench;

    public OldLady(Bench bench,String name) {
        this.bench=bench;
        this.name=name;
    }
    @Override
    public void run() {
        bench.takeASeat(name);
    }



}
