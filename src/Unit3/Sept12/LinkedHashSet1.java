package Unit3.Sept12;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);
        lhs.add("one");
        lhs.add("two");
        lhs.add("three");
        lhs.add("three");
        System.out.println(lhs);
    }
}
