public class CollegeStudent extends Student1 {
    public CollegeStudent(String name, int roll_no){
        super(name, roll_no);
    }
    public void attend_class(){
        System.out.println(name+" Attend class on smart Board.");
    }
    public void give_exam(){
        System.out.println(roll+" Give exam in Online Mode");
    }
}
