package dataTypesAndVariables.exercise;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class N01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber=Integer.parseInt(scanner.nextLine());
        int secondNumber=Integer.parseInt(scanner.nextLine());
        int thirdNumber=Integer.parseInt(scanner.nextLine());
        int fourthNumber=Integer.parseInt(scanner.nextLine());
        System.out.println((firstNumber+secondNumber)/thirdNumber*fourthNumber);
    }
}
