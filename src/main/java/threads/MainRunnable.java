package threads;

public class MainRunnable {
    public static void main(String[] args) {

        PrintingRunnable printingRunnable = new PrintingRunnable("T1");
        PrintingRunnable printingRunnable2 = new PrintingRunnable("T2");
        PrintingRunnable printingRunnable3 = new PrintingRunnable("T3");
        Thread t1 = new Thread(printingRunnable);
        Thread t2 = new Thread(printingRunnable2);
        Thread t3 = new Thread(printingRunnable3);
        t1.start();
        t2.start();
        t3.start();
    }
}
