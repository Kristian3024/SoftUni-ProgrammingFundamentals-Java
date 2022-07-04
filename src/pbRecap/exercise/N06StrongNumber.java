package pbRecap.exercise;

import java.util.Scanner;

public class N06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumf = 0;
        int lastDigit = 0;
        int f = 1;
        int start=number;
        while (number != 0) {
            lastDigit = number % 10;
            number /= 10;
            for (int i = 1; i <= lastDigit; i++) {
                f *= i;
            }
            sumf += f;
        }
        if (sumf == start) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
