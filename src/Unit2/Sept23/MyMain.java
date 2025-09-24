package Unit2.Sept23;

public class MyMain {
    public static void main(String[] args) {
        Thread1 th1=new Thread1();
        th1.start();
        Thread2 th2=new Thread2();
        th2.start();
        System.out.println(th1.getName());
        th1.setName("KIET thread");
        System.out.println(th1.getName());
        System.out.println(th1.getPriority());
        th1.setPriority(9);
        System.out.println(th1.getPriority());
    }
}
