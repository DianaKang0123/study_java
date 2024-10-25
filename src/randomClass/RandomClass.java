package randomClass;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(6) + 1;
        // nextInt(범위) + 연산가능
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(x);
    }
}
