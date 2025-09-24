package Unit2.Sept23;

public class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(500);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }
}
