package Task3;

public class PriorityThread extends Thread{

    @Override
    public void run() {
        for (int i=0; i<50; i++){
            System.out.println(i + "from " + Thread.currentThread());
        }
    }
}
