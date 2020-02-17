package threads.exercices;

public class Bus {
    public static void main(String[] args) {

        Bench bench = new Bench(5);
        OldLady lady1 = new OldLady(bench,"Mariora");
        OldLady lady2 = new OldLady(bench,"Dumitrita");
        OldLady lady3 = new OldLady(bench,"Thereza");
        OldLady lady4 = new OldLady(bench,"Saveta");
        lady1.start();
        lady2.start();
        lady3.start();
        lady4.start();


    }
}
