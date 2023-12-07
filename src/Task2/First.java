package Task2;



public class First implements Runnable {

    private Pause lPause;

    public First(Pause lPause) {
        this.lPause = lPause;
    }

    @Override
    public void run() {

        try {

            synchronized (lPause){
                lPause.wait();
            }
        }catch (InterruptedException e){
            System.out.println("Error");
        }
        System.out.println("first is finished");



    }
}
