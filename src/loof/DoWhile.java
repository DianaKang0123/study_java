package loof;

public class DoWhile {
    public static void main(String[] args) {
        // 조건에 상관없이 한번은 무조건 실행된다는 특징
        int i = 10;
//        while (i<3){
//            System.out.println(i);
//            i++;
//        }
        do {
            System.out.println(i);
            i++;
        } while (i < 3);
    }
}
