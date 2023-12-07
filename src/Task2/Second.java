package Task2;

public class Second implements Runnable{

    private Pause lPause;

    public Second(Pause lPause) {
        this.lPause = lPause;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
            synchronized (lPause){
                System.out.println("second is finished");
                lPause.notify();
            }
        }catch (InterruptedException e){
            System.out.println("Error");
        }

    }
}
