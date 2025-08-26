public class schoolStudent extends Person {
    public String course;
    public schoolStudent(String address, String course){
        super(address);
        this.course=course;
    }

    public void getCourse() {
        System.out.println("Course : "+ course);
    }
}
