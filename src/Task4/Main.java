package Task4;

public class Main {
    public static void main(String[] args) {
        Sync1 sync = new Sync1();



        for (int i=0; i<5;i++){
            Thread thread = new Thread(new Sync2(sync));
            thread.setName("Thr_"+i);
            thread.start();
        }

    }
}
