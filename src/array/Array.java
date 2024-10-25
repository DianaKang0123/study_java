package array;

public class Array{
    public static void main(String[] args) {
        /*String[] cars = {"Tesla", "Corvette", "Camaro"};

        cars[0] = "Mustang";

        System.out.println(cars[0]);*/

        String[] cars = new String[3];
        cars[0] = "현대";
        cars[1] = "기아";
        cars[2] = "삼성";


        System.out.println(cars[2]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
