package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class N08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        double maxVolume=0;
        String best="";
        for (int i = 1; i <=n ; i++) {
            String model= scanner.nextLine();
            double radius=Double.parseDouble(scanner.nextLine());
            int height=Integer.parseInt(scanner.nextLine());
            if(Math.PI*radius*radius*height>maxVolume){
                maxVolume=Math.PI*radius*radius*height;
                best=model;
            }
        }
        System.out.print(best);
    }
}
