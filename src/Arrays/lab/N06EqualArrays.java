package Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class N06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr1= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] numbersArr2= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isDifferent=false;
        int sum=0;
        for (int i = 0; i <= numbersArr1.length - 1; i++) {
            if(numbersArr1[i]!=numbersArr2[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                isDifferent=true;
                break;
            }
            sum+=numbersArr1[i];
        }
        if(!isDifferent){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }
    }
}
