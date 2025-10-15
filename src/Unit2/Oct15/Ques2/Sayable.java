package Unit2.Oct15.Ques2;

import Unit2.Oct14.Ques3.MethodReference;

public interface Sayable {
    default void sayMore(){
        System.out.println("Hii, I am default method.");
    }
    static void sum(int x, int y){
        System.out.println(x+y);
    }
    void say();
}

