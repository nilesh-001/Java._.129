package Unit1;

abstract class Student1 {
    String name;
    int roll;
    public Student1(String name, int roll_no){
        this.name=name;
        this.roll=roll_no;
    }
    abstract void attend_class();
    abstract void give_exam();
}
