package chap_01;

public class _09_if_statements {
    public static void main(String[] args) {

        int age = 15;

        if (age >= 75) {
            System.out.println("Ok Boomer!");
        }
        else if(age >= 18) {
            System.out.println("you are an adult");
        }
        else if(age >= 13) {
            System.out.println("You are a teenager!");
        }
        else {
            System.out.println("You are not an adult!");
        }
    }
}
