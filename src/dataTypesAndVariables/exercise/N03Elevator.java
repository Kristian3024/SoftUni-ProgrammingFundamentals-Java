package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class N03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        int p =Integer.parseInt(scanner.nextLine());
        int lifts=n/p;
        if(n%p!=0){
            lifts++;
        }
        System.out.print(lifts);
    }
}
