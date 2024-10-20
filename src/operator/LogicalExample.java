package operator;
/*
num1~3 int 변수 선언 10,20,30으로 초기화
세변수의 합 계산, 그결과 sum에 저장
평균계산, 결과 average에 저장
소수점이 이하 결과는 버림
sum과 average 출력
*/
public class LogicalExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;
        // int끼리의 나눗셈은 소숫점을 자동으로 버림

        System.out.println("sum = "+ sum);
        System.out.println("average = "+ average);
    }
}
