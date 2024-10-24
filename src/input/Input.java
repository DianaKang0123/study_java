package input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.println("your name is " + name);
        System.out.println("나이을 입력하세요: ");
        int age = sc.nextInt();
        System.out.println("your age is " + age);
        System.out.println("좋아하는 음식을 입력하세요.");
        String food = sc.nextLine();
        System.out.println("your favorite food is " + food);*/
        // 이렇게만 입력 하였을 때
        // nextInt() 뒤에 \n이 자동으로 추가
        // 하지만 nextInt()의 경우 숫자만인식하기 떄문에 다음 String 타입에
        // 입력값을 받지않는 문제발생

        // 수정
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.println("your name is " + name);
        System.out.println("나이을 입력하세요: ");
        int age = sc.nextInt();
        sc.nextLine(); // 단순히 이걸 추가해주면 문제해결
        System.out.println("your age is " + age);
        System.out.println("좋아하는 음식을 입력하세요.");
        String food = sc.nextLine();
        System.out.println("your favorite food is " + food);

    }
}
