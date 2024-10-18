package operator;

public class CompStr {
    public static void main(String[] args) {
        // 문자열 비교
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); //리터럴 비교
        boolean result2 = str1.equals("문자열1"); // 문자열 변수, 리터럴 사이 비교
        boolean result3 = str1.equals(str2); // 변수 간의 비교

        System.out.println(result1); // true
        System.out.println(result2); // ture
        System.out.println(result3); // false

        System.out.println("hello" == "hello");
        // 특정한 조건에서는 true가 나오지 않음 따라서 .equals()를 사용해야한다.
        // ctrl+shift+ enter = 문장 자동 완성, ; 가 빠진 경우 유용하게 사용가능

    }

}
