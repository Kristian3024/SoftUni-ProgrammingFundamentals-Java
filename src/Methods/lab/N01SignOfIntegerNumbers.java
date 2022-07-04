package Methods.lab;

import java.util.Scanner;

public class N01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        positiveOrNegative(number);
    }

    public static void positiveOrNegative(int num) {
        if (num > 0) {
            System.out.println("The number "+num + " is positive.");
        } else if (num < 0) {
            System.out.println("The number " +num + " is negative.");
        } else {
            System.out.print("The number 0 is zero.");
        }
    }
}
