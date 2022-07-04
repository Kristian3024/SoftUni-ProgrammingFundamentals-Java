package Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class N03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr= Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum=0;
        for (int i = 0; i <= numbersArr.length-1; i++) {
            if(numbersArr[i]%2==0){
                sum+=numbersArr[i];
            }
        }
        System.out.print(sum);
    }
}
