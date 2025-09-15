public class StringOperations {
    public static void main(String args[]){
        String s1="java";
        String s2="java";
        String s4="JAVA";
        String s3=new String("java");
        //compares object references
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s4==s2);
       //compares obect values
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s4));
    }
}
