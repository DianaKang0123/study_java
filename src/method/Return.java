package method;

public class Return {
    public static int getMaxLottoNumber(){
        return 45;
    }

    public static void main(String[] args) {
        int num = getMaxLottoNumber(); //메소드 반환형과 같은 타입으로 선언
        System.out.println(num);
    }

}
