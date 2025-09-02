package Unit1;

public class MyA {
    static {
        System.out.println("I am in Static block");
    }
    public static void main(String[] args) {
        A a1=new A();
        A a2=new A();
        a1.bread=a1.bread-1;
        System.out.println(a2.bread);
        A.display();
        A.eat();
        A.display();
    }
}

