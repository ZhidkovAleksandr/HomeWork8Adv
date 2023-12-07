package Task4;

public class Sync1 {
    private String announce = "base";

    public synchronized void setAnnounce(String announce) {
        this.announce = announce;
        for (int i=0; i<4; i++){
            System.out.println(announce +" iter "+ i);
        }
    }
}
