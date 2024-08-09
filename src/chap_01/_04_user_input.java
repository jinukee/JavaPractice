package chap_01;

import java.util.Scanner;

public class _04_user_input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine(); // nextLine() method separates string value with \n(null terminating) value
        System.out.println("How old are you? ");
        int age = scanner.nextInt(); // but nextInt() method can't skip \n value
        scanner.nextLine(); // So we call nextLine() method before calling nextLine() method to skip \n value
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();


        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);

    }
}
