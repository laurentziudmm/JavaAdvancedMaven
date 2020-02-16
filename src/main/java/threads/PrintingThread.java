package threads;

public class PrintingThread extends Thread {

    public String name;

    public PrintingThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(name + " Printing Thread is running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
