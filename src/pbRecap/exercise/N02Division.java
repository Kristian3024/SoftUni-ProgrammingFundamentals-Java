package pbRecap.exercise;

import java.util.Scanner;

public class N02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        int delitel=0;
        if(num%2==0){
            delitel=2;
        }
        if(num%3==0){
            delitel=3;
        }
        if(num%6==0){
            delitel=6;
        }
        if(num%7==0){
            delitel=7;
        }
        if(num%10==0){
            delitel=10;
        }
        if(delitel!=0) {
            System.out.printf("The number is divisible by %d", delitel);
        }
        else{
            System.out.println("Not divisible");
        }
    }
}
