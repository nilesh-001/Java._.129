package Unit3.Sept19;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(16, "Nikhil", 121));
        al.add(new Student(17, "Ram", 122));
        al.add(new Student(25, "Shyam", 123));
        al.add(new Student(21, "Harsh", 124));
        al.add(new Student(11, "Maksud", 125));
        Collections.sort(al);
        for(Student st : al){
            System.out.println("NAME : " + st.name+ " AGE : "+st.age + " ROLL_NO : "+ st.roll_no);
        }
    }
}
