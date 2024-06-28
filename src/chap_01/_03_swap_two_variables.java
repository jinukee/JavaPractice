package chap_01;

public class _03_swap_two_variables {
    public static void main(String[] args) {

        String x = "water";
        String y = "Kool-Aid";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}
