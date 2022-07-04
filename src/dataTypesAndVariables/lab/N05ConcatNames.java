package dataTypesAndVariables.lab;

import java.util.Scanner;

public class N05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName= scanner.nextLine();
        String sureName= scanner.nextLine();
        String delimiter= scanner.nextLine();
        System.out.printf("%s%s%s",firstName,delimiter,sureName);
    }
}
