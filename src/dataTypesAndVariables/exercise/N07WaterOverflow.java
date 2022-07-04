package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class N07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sumLiters=0;
        for (int i = 1; i <=n ; i++) {
            int liters=Integer.parseInt(scanner.nextLine());
            if (sumLiters+liters>255){
                System.out.println("Insufficient capacity!");
            }
            else{
                sumLiters+=liters;
            }
        }
        System.out.print(sumLiters);
    }
}
