package Task4;

public class Sync2 implements Runnable{

    private Sync1 field;

    public Sync2(Sync1 field){
        this.field = field;
    }

    @Override
    public void run() {

        this.field.setAnnounce(Thread.currentThread().getName());
    }
}
