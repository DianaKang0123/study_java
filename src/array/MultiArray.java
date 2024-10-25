package array;

public class MultiArray {
    public static void main(String[] args) {
        String[][] cars = {
                {"camero", "corvette", "silverado"},
                {"현대", "기아", "삼성"},
                {"BMW", "Audi", "Benz"}
        };

        /*String[][] cars = new String[3][3];

        cars[0][0] = "1";
        cars[0][1] = "2";
        cars[0][2] = "3";
        //이런식의 선언도 가능*/



        for(int i=0; i<cars.length; i++){
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j] + " ");
            }
        }


    }
}
