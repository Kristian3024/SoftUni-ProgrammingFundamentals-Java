package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class N01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagon=Integer.parseInt(scanner.nextLine());
        int[] people=new int[wagon];
        int sum=0;
        for (int i = 0; i <= wagon-1; i++) {
            people[i]=Integer.parseInt(scanner.nextLine());
            sum+=people[i];
            System.out.print(people[i]+" ");
        }
        System.out.printf("%n%d",sum);
    }
}
