public class StringBufferMethodExample {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("welcome");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("SumaReddy");
        System.out.println(sb);
        sb.setCharAt(1,'s');
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.delete(11,sb.length());
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}