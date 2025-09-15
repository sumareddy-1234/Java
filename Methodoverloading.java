class Methodoverloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }
    public static double add(int a, double b) {
        return a + b;
    }
    public static double add(double a, int b) {
        return a + b;
    }
    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static String add(String a, String b) {
        return a + b;
    }

}
class Method
{
    public static void main(String[] args) {
        System.out.println(Methodoverloading.add(123,231));
        System.out.println(Methodoverloading.add(34,34,56));
        System.out.println(Methodoverloading.add(11.3,42.4));
        System.out.println(Methodoverloading.add(12,9.09));
        System.out.println(Methodoverloading.add(23.8,9));
        System.out.println(Methodoverloading.add(96.8,85.6,85.6));
        System.out.println(Methodoverloading.add("Hello","World!"));

    }

}

