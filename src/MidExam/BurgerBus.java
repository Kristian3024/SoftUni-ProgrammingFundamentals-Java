package MidExam;

import java.util.Scanner;

public class BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCities = Integer.parseInt(scanner.nextLine());
        double sum=0;
        for (int i = 1; i <= numCities; i++) {
            String name = scanner.nextLine();
            double earned = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            if (i % 5 == 0) {
            earned*=0.9;
            } else if (i % 3 == 0) {
                expenses *= 1.5;
            }
            sum+=(earned-expenses);
            System.out.printf("In %s Burger Bus earned %.2f leva. %n",name, earned-expenses);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.",sum);
    }
}
