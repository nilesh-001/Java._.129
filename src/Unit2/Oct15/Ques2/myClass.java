package Unit2.Oct15.Ques2;

import Unit2.Oct14.Ques3.MethodReference;

public class myClass {

    public static void main(String[] args) {
        MethodReference methodreference = new MethodReference();
        Sayable sayable = methodreference::saySomethingNonStatic;
        sayable.say();
        sayable.sayMore();
        Sayable.sum(10, 5);
        }
}
