package Task5;

public class Main {

    public static Object bl1 = new Object();
    public static Object bl2 = new Object();

    public static void main(String args[]) {
        ThreadBl1 threadBl1 = new ThreadBl1();
        ThreadBl2 threadBl2 = new ThreadBl2();
        threadBl1.start();
        threadBl2.start();
    }

    private static class ThreadBl1 extends Thread {
        public void run() {
            synchronized (bl1) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " holding lock 1");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread: " + Thread.currentThread().getName() + " waits lock 2");

                synchronized (bl2) {
                    System.out.println("Thread: " + Thread.currentThread().getName() + "holding locks 1,2");
                }
            }
        }
    }

    private static class ThreadBl2 extends Thread {
        public void run() {
            synchronized (bl2) {
                System.out.println("Thread: " + Thread.currentThread().getName() + "holding lock 2...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread: " + Thread.currentThread().getName() + "waits lock 1");

                synchronized (bl1) {
                    System.out.println("Thread: " + Thread.currentThread().getName() + "holding locks 1,2");
                }
            }
        }
    }

}
