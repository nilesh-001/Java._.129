package Unit2.Oct14.Ques4;

public class ConstructorReference {
    public static void main(String[] args) {
        Messagable hello = Message::new;
        hello.getMessage("Hello...!!! 👋");
    }
}
