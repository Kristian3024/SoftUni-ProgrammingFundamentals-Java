package Methods.lab;

import java.util.Scanner;

public class N03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        triangleMaker(number);
    }

    public static void triangleMaker(int number) {
        for (int i = 1; i <= number; i++) {
            Line(1, i);
            System.out.println();
        }
        for (int i = number - 1; i >= 1; i--) {
            Line(1,i);
            System.out.println();
        }
    }

    public static void Line(int start, int stop) {
        for (int i = start; i <= stop; i++) {
            System.out.print(i + " ");
        }
    }
}
