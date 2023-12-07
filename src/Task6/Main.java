package Task6;


    public class Main {

        public static Object bl1 = new Object();
        public static Object bl2 = new Object();

        public static void main(String args[]) {
            ThreadBl1R threadBl1R = new ThreadBl1R();
            ThreadBl2R threadBl2R = new ThreadBl2R();
            threadBl1R.start();
            threadBl2R.start();
        }

        private static class ThreadBl1R extends Thread {
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

        private static class ThreadBl2R extends Thread {
            public void run() {
                synchronized (bl1) {
                    System.out.println("Thread: " + Thread.currentThread().getName() + "holding lock 2...");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                    }
                    System.out.println("Thread: " + Thread.currentThread().getName() + "waits lock 1");

                    synchronized (bl2) {
                        System.out.println("Thread: " + Thread.currentThread().getName() + "holding locks 1,2");
                    }
                }
            }
        }

    }
