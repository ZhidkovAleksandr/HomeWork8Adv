package Task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {



        Pause p = new Pause("the pause");
        First fClass = new First(p);
        Second sClass = new Second(p);

        Thread fT = new Thread(fClass);
        Thread sT = new Thread(sClass);

        fT.start();
        sT.start();


        Thread.sleep(10000);

        System.out.println("this is: " +  Thread.currentThread());






    }
}