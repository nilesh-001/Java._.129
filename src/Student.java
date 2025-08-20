public class Student {
    int roll_no;
    String name;
    Student(){
        System.out.println("I am a defualt consrtrucor");
    }
    Student(int r, String n){
        System.out.println("I am the parameterized constructor:");
        roll_no=r;
        name=n;
    }
    Student (Student s){
        name=s.name;
        roll_no=s.roll_no;
    }
    public void display(){
        System.out.println("ROll No "+roll_no);
        System.out.println("Name is "+ name);
    }
}
