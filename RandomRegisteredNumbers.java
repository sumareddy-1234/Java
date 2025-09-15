import java.util.Random;
public class RandomRegisteredNumbers {  
    public static void main(String args[])
    {
        String regNumber[]={"23A91A4454","23A91A4457","23A91A4448","23A91A4442","23A91A4423"};
        Random random=new Random();
        int randomNumber=random.nextInt(regNumber.length);
        System.out.println(regNumber[randomNumber]);
    }
}
