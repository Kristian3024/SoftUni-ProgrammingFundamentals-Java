package pbRecap.exercise;

import java.util.Scanner;

public class N05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String password = "";
        String input = scanner.nextLine();
        int wrong = 0;
        boolean flag = false;
        for (int i = login.length() - 1; i >= 0; i--) {
            password += login.charAt(i);
        }
        while (!input.equals(password)) {

            wrong++;
            if (wrong == 4) {
                System.out.printf("User %s blocked!", login);
                flag = true;
break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        if (flag == false) {
            System.out.printf("User %s logged in.", login);
        }
    }
}
