package pbRecap.exercise;

import java.util.Scanner;

public class N03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double discount = 0;
        switch (day) {
            case "Friday":
                switch (type) {
                    case "Students":
                        price = 8.45;
                        if (people >= 30) {
                            discount = 0.15;
                        }
                        break;
                    case "Business":
                        price = 10.9;
                        if (people >= 100) {
                            people -= 10;
                        }
                        break;
                    case "Regular":
                        price = 15;
                        if (people >= 10 && people <= 20) {
                            discount = 0.05;
                        }
                        break;

                }
                break;
            case "Saturday":
                switch (type) {
                    case "Students":
                        price = 9.80;
                        if (people >= 30) {
                            discount = 0.15;
                        }
                        break;
                    case "Business":
                        price = 15.6;
                        if (people >= 100) {
                            people -= 10;
                        }
                        break;
                    case "Regular":
                        price = 20;
                        if (people >= 10 && people <= 20) {
                            discount = 0.05;
                        }
                        break;

                }
                break;
            case "Sunday":
                switch (type) {
                    case "Students":
                        price = 10.46;
                        if (people >= 30) {
                            discount = 0.15;
                        }
                        break;
                    case "Business":
                        price = 16;
                        if (people >= 100) {
                            people -= 10;
                        }
                        break;
                    case "Regular":
                        price = 22.5;
                        if (people >= 10 && people <= 20) {
                            discount = 0.05;
                        }
                        break;
                }
                break;
        }
        System.out.printf("Total price: %.2f",price*people-discount*price*people);
    }
}
