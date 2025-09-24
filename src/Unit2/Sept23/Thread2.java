package Unit2.Sept23;

public class Thread2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            if(i%2==0){
                try{
                    Thread.sleep(500);
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
                System.out.println(i);
            }
        }
    }
}
