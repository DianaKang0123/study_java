package method;

public class Argument {
    public static void print(/*전달 값 없음*/) {
        System.out.println("전달값없음");
    }
    public static void print2(int a){
        System.out.println(a);
    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        print();
        print2(3); // 전달값 전달
        add(3, 4); // 전달값 여러개 전달
    }
}
