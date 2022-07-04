package Arrays.lab;

import java.util.Scanner;

public class N04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array=scanner.nextLine().split(" ");
        for (int i = 0; i <= (array.length-1)/2 ; i++) {
            String old=array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = old;
        }
        System.out.print(String.join(" ",array));
    }
}
