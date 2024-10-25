package string;

public class StringClass {
    public static void main(String[] args) {
        String name = "Diana";

        boolean result1 = name.equalsIgnoreCase("diana"); // 대소문자 구분안함
        int result2 = name.length(); // 길이
        char result3 = name.charAt(0); // 해당 인덱스의 글자
        int result4 = name.indexOf("a"); // 글자의 인덱스 (중복시 첫 글자 기준)
        boolean result5 = name.isEmpty(); // 비어있는지 여부
        String result6 = name.toUpperCase(); // 대문자 변환
        String result7 = name.toLowerCase(); // 소문자 변환
        String result8 = name.trim(); // 앞뒤 공백 제거
        String result9 = name.replace('n', 'r'); // 대체

        System.out.println(
                result1 + "\n" +
                result2 + "\n" +
                result3 + "\n" +
                result4 + "\n" +
                result5 + "\n" +
                result6 + "\n" +
                result7 + "\n" +
                result8 + "\n" +
                result9);

    }
}
