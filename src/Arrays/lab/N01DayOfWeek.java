package Arrays.lab;

import java.util.Scanner;

public class N01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysOfWeek = new String[]{
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        int n=Integer.parseInt(scanner.nextLine());
        if(n>=1 && n<=7) {
            System.out.printf("%s",daysOfWeek[n-1]);
        }
        else{
            System.out.printf("Invalid day!");
        }
    }
}
