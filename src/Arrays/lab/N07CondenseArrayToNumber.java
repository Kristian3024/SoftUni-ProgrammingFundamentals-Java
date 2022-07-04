package Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class N07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while (numbersArr.length > 1) {
            int[] newNums=new int[numbersArr.length-1];
            for (int i = 0; i < numbersArr.length-1 ; i++) {
                int sum=numbersArr[i]+numbersArr[i+1];

                newNums[i]=sum;
            }
            numbersArr=newNums;
        }
        System.out.printf("%d",numbersArr[0]);
    }
}
