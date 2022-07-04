package pbRecap.exercise;

import java.util.Scanner;

public class N09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=Integer.parseInt(scanner.nextLine());
        double price=0;
        int days=0;
        int capsules=0;
        double sum=0;
        for (int i = 1; i <= N ; i++) {
            price=Double.parseDouble(scanner.nextLine());
            days=Integer.parseInt(scanner.nextLine());
            capsules=Integer.parseInt(scanner.nextLine());
            sum+=price*days*capsules;
            System.out.printf("The price for the coffee is: $%.2f %n",price*days*capsules);
        }
        System.out.printf("Total: $%.2f",sum);
    }
}
