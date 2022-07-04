package pbRecap.exercise;

import java.util.Scanner;

public class N07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double coins = 0;
        double money = 0;
        double price = 0;
        while (!input.equals("Start")) {
            coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                money += coins;
            } else {
                System.out.printf("Cannot accept %.2f %n", coins);
            }
            input = scanner.nextLine();
        }
        input= scanner.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.printf("Invalid product %n");
                    break;
            }
            if (money - price < 0) {
                System.out.printf("Sorry, not enough money %n");
            }
            else if(money-price>=0 && price!=0){
                money-=price;
                System.out.printf("Purchased %s %n",input);
            }
            input= scanner.nextLine();
        }
        System.out.printf("Change: %.2f",money);
    }
}
