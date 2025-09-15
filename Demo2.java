@FunctionalInterface
interface Calculator{
    int calculate(int a,int b); //abstract method
    default void displayResult(int result){
        System.out.println("Result:"+result);
    }
    static void displayWelcomeMessage(){
        System.out.println("welcome to Calculator Application");
    }
}
class Demo2{
    public static void main(String args[]){
        Calculator.displayWelcomeMessage();
        Calculator add=(a,b)->(a+b);
        Calculator sub=(a,b)->(a-b);
        Calculator mul=(a,b)->(a*b);
        Calculator div=(a,b)->{
            if(b!=0){
                return (a/b);
            }else{
                System.out.println("Can't divide a number by zero");
            return 0;
            }
        };
        int addResult=add.calculate(2,3);
        add.displayResult(addResult);
        int subResult=sub.calculate(8,4);
        sub.displayResult(subResult);
        int mulResult=mul.calculate(4,4);
        mul.displayResult(mulResult);
        int divResult=div.calculate(4,2);
        div.displayResult(divResult);
    }
}
