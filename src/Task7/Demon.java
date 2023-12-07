package Task7;

public class Demon  extends Thread{
    @Override
    public void run() {

        System.out.println(Thread.currentThread().isDaemon());

    }

    public static void main(String[] args) {
        Demon daemonThread = new Demon();
        daemonThread.setDaemon(true);
        daemonThread.start();


    }
}
