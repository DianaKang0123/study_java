package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;
        int sum = a + b;
        System.out.println("sum = " + sum);
        int sub = a - b;
        System.out.println("sub = " + sub);
        int multi = a * b;
        System.out.println("multi = " + multi);
        int div = a / b;
        System.out.println("div = " + div);
        int mod = a % b;
        System.out.println("mod = " + mod);
        // mod 계산에서 분모가 0인 경우 오류 발생
    }
}
