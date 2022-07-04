package dataTypesAndVariables.lab;

import java.util.Scanner;

public class N02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double dollars=Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",dollars*1.36);
    }
}
