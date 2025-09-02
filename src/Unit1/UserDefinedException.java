package Unit1;

public class UserDefinedException {
    public void validate(int age) throws InvalidAgeException {
        if(age<18)
            throw new InvalidAgeException("Cannot caste vote, age is less than 18");
        else
            System.out.println("Eligible to Vote");
    }
}
