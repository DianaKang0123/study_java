package method;

public class Overloading {
    public static int add(int a, int b) {
       return a + b;
    }

    public static int add (int a, int b, int c) {
        return a + b + c;
    }

    public static double add (double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        /*int result1 = add(1, 5);
        int result2 = add(10, 30, 40);
        double result3 = add(39.4, 54.3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);*/

        System.out.println(add(1, 4));
        System.out.println(add(10, 30, 40));
        System.out.println(add(39.4, 54.3));

    }
}
