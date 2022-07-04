package pbRecap.lab;

import java.util.Scanner;

public class MultiplicationTableV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int times=Integer.parseInt(scanner.nextLine());
        if(times<=10){
            for (int i = times; i <=10 ; i++) {
                int result=n*i;
                System.out.printf("%d X %d = %d %n",n,i,result);
            }
        }
        else{
            int result=n*times;
            System.out.printf("%d X %d = %d %n",n,times,result);
        }
    }
}
