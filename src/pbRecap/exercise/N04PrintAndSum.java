    package pbRecap.exercise;

    import java.util.Scanner;

    public class N04PrintAndSum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int start=Integer.parseInt(scanner.nextLine());
            int stop=Integer.parseInt(scanner.nextLine());
            int sum=0;
            for (int i = start; i <=stop ; i++) {
                System.out.print(i+" ");
                sum+=i;
            }
            System.out.printf("%nSum: %d",sum);
        }
    }
