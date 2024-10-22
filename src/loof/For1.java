package loof;

public class For1 {
    public static void main(String[] args) {
        /*for (int i = 1; i<=10; i++){
            System.out.println(i);
        }*/

        int sum = 0;
        int endnum = 3;

        for (int i = 1; i <= endnum; i++) {
            sum += i;
            System.out.println(i + "|" + sum);
        }
    }
}
