package condition;

public class Ex1{
    public static void main(String[] args) {
        // 10000원 이상일때 10% 할인
        // 20살에겐 5프로 할인

        double price = 14000.0;
        int age = 20;
        double discount = 0;
        double total = 0;
        if(10000<=price){
            discount = discount + (price * 0.1);
        }
        if(age==20){
            discount = discount + (price * 0.05);
        }
        total = price - discount;
        System.out.println(total);
    }
}
