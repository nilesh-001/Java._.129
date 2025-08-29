//import java.util.*;
//public class VoteMain {
//    public static void main(String[] args)throws InvalidAgeException {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the age: ");
//        int age=sc.nextInt();
//        UserDefinedException obj=new UserDefinedException();
//        obj.validate(age);
//    }
//}


public class VoteMain {
    public static void main(String[] args) {
        UserDefinedException udf = new UserDefinedException();
        try{
            udf.validate(19);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}