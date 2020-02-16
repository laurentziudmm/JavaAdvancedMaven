package threads.exercices;

public class Bus {
    public static void main(String[] args) {

        Bench bench = new Bench(1);
        OldLady lady = new OldLady(bench,"Mariora");
        OldLady lady2 = new OldLady(bench,"Dumitrita");
        lady.start();
        lady2.start();


    }
}
