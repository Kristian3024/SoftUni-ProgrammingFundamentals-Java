package dataTypesAndVariables.lab;

import java.util.Scanner;

public class N08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character=scanner.nextLine().charAt(0);
        if(Character.isLowerCase(character)){
            System.out.println("lower-case");
        }
        else{
            System.out.println("upper-case");;
        }
    }
}
