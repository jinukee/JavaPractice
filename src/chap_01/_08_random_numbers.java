package chap_01;
import java.util.Random;

public class _08_random_numbers {
    public static void main(String[] args) {

        Random random = new Random();

        //int x = random.nextInt(6) + 1; generate random num 1 ~ 6
        //double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(z);

    }
}
