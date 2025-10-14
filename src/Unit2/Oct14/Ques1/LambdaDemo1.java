package Unit2.Oct14.Ques1;

public class LambdaDemo1 {
    public static void main(String[] args) {
        NumericTest isEven = (n ) -> n%2 == 0;
        System.out.println(isEven.test(12));
    }
}
