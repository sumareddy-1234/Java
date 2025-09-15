public class MethodsOfString {
    public static void main(String[] args) {
        String s1="java";
        String s2="JAVA";
        String s3=new String("java");
        //compares object references
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        //compares object values
        System.out.println(s1.equals(s2)); 
        //Ignores case sensetive letters while comparing Strings
        System.out.println(s1.equalsIgnoreCase(s2));
        //returns the character of the given index
        System.out.println(s1.charAt(1));
        //returns the index of the given character
        System.out.println(s1.indexOf('a'));
        //replaces the old character with new character
        s1.replace('a','o');
        System.out.println(s1);
        String s4="java programming";
        //replaces all particular substrings with a new substring in a string 
        s4=s4.replaceAll("a","o");
        System.out.println(s4);
        //checks wheather the string starts with given character
        System.out.println(s4.startsWith("j"));
        //checks wheather the string ends with given character
        System.out.println(s4.endsWith("y"));
        //returns the substring by giving starting index
        System.out.println(s4.substring(4));
        //returns the substring by giving specific starting index and ending index
        System.out.println(s4.substring(0,3));
        //checks whether the substring present in a string or not
        System.out.println(s4.contains("pro"));
    }
    
}
