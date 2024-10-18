package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열 연산
        String result = "hello " + "world";
        System.out.println("result = " + result);

        // 문자열 연산 2
        String result2 = "hello1 ";
        String result3 = "world1";
        System.out.println(result2 + result3);

        // 문자열+숫자
        String result4 = "a + b = " + 10;
        System.out.println(result4);
        // 이 경우 문자열 뒤 숫자를 문자열로 변환하여 연산한다.

        // 문자열 + 숫자2
        int num = 20;
        String str = "a + b = ";
        String result5 = str + num;
        System.out.println(result5);

    }
}
