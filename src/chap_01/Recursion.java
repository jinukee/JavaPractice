package chap_01;

public class Recursion {
    public static void main(String[] args) {
        int result1 = sum(10);
        int result2 = sum(5, 10);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static int sum(int k){
        if (k > 0){
            return k + sum(k - 1);
        }
        //Halting condition
        else{
            return 0;
        }
    }

    public static int sum(int start, int end){
        if (end > start){
            return end + sum(start, end - 1);
        }
        else{
            return end;
        }
    }
}
