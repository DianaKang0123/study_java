package loof;

public class While1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endnum = 3;
        while(i<=endnum){
            sum += i;
            System.out.println(i + "|" + sum);
            i++;
        }
    }
}
