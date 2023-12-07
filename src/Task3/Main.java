package Task3;

public class Main {
    public static void main(String[] args) {
        Thread pr1 = new PriorityRunner1();
        Thread pr2 = new PriorityRunner2();
        Thread peThread = new PriorityThread();

        pr1.setPriority(Thread.MIN_PRIORITY);
        pr2.setPriority(Thread.MAX_PRIORITY);
        peThread.setPriority(Thread.NORM_PRIORITY);

        pr1.start();
        pr2.start();
        peThread.start();

    }
}
