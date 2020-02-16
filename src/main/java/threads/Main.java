package threads;

public class Main {
    public static void main(String[] args) {

        PrintingThread printingThread = new PrintingThread("T1");
        PrintingThread printingThread2 = new PrintingThread("T2");
        PrintingThread printingThread3 = new PrintingThread("T3");
        printingThread.start();
        printingThread2.start();
        printingThread3.start();

    }
}
