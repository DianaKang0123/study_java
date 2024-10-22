package method;

public class Scope {
    /*public static void scope () {
        int b = 20
        System.out.println(a); //불가능
    }

    public static void main(String[] args) {
        int a = 10; // 변수가 선언 된 영역 내에서만 사용가능
        System.out.println(a);
        System.out.println(b); //불가능

    }*/

    public static void main(String[] args) {
        int c = 30;
        if (c > 10) {
            int d = 40;
            System.out.println(d);
        }
        /*System.out.println(d); // 불가능*/
    }

}


