package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class N05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start=Integer.parseInt(scanner.nextLine());
        int stop=Integer.parseInt(scanner.nextLine());
        for (int i = start; i <= stop ; i++) {
            char character=(char) i;
            System.out.print(character+ " ");
        }
    }
}
