package Unit2.Oct14.Ques3;
import java.lang.reflect.Method;
public class MethodReference {
    public static void saySomethingStatic(){
        System.out.println("Hello, this is Static method :(");
    }

    public void saySomethingNonStatic(){
        System.out.println("Hello, this is non-Static method :) ");
    }
    public static void main(String[] args) {
        Sayable sayableOne  = MethodReference::saySomethingStatic;
        sayableOne.say();

        MethodReference obj = new MethodReference();
        Sayable sayableTwo = obj::saySomethingNonStatic;
        sayableTwo.say();
    }
}
