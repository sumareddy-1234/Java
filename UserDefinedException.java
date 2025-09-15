package Package2;
import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class UserDefinedException {
    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18||age>60){
            throw new InvalidAgeException("Age must be in between 18 to 60");
        }
        else{
            System.out.println("Valid Age:"+age);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your Age");
        int age=sc.nextInt();
        try{
            checkAge(age);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }
}
    

