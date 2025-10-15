package Unit2.Oct15.Ques1;

import com.sun.security.jgss.GSSUtil;

import java.util.stream.Stream;

public class JavaStreamExample {
    public static void main(String[] args) {
        Stream.iterate(1, element->element +1).
                filter(e->e%5==0).
                limit(5).
                forEach(System.out::println);
    }
}
