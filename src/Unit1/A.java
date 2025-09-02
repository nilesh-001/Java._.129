package Unit1;

public class A {
    static int bread = 10;
    static {
        System.out.println("I am in Class A");
    }
    public static void display(){
        System.out.println("Sliced remaining " + bread);
    }
    public static void eat(){
        bread--;
    }
}
