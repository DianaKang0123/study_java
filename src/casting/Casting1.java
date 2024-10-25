package casting;

public class Casting1 {
    public static void main(String[] args) {
        int a = 1929394;
        long b;
        double c;

        /*b = a;
        System.out.println(b);

        c = b;
        System.out.println(c);*/

        b = (long) a;
        System.out.println(b);

        c = (double) b;
        System.out.println(c);

    }
}
