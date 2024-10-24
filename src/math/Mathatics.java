package math;

public class Mathatics {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y); // 최대값
        System.out.println(z);

        double a = Math.min(x, y); // 최소값
        System.out.println(a);

        double b = Math.abs(y); // 절댓값
        System.out.println(b);

        double c = Math.sqrt(y); // 제곱근
        System.out.println(c);

        double d = Math.ceil(x); // 반올림
        System.out.println(d);

        double e = Math.floor(x); // 내림
        System.out.println(e);

    }
}
