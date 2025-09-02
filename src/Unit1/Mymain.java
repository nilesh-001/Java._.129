package Unit1;

public class Mymain {
    public static void main(String[] args) {
        Student obj = new Student(123, "Nilesh");
        Student obj1= new Student(obj);
        obj.display();
        obj1.display();
    }
}
