package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String > books = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while(!input.equals("Done")){
            String command = input.split(" ")[0];


            if ("Add".equals(command)) {
                String currentBook = input.split("\\|")[1];
                if (!books.contains(currentBook)) {
                    books.add(0, currentBook);
                }
            } else if ("Take".equals(command)) {
                String currentBook = input.split("\\|")[1].trim();
                if(books.contains(currentBook))
                    books.remove(books.indexOf(currentBook));
            } else if ("Swap".equals(command)) {
                String currentBook = input.split("\\|")[1];
                String currentBook2 = input.split("\\|")[2];
                if (books.contains(books.indexOf(currentBook)) && books.contains(currentBook2)) {
                    int firstIndex = books.indexOf(currentBook);
                    int secondIndex = books.indexOf(currentBook2);
                    books.set(firstIndex, currentBook2);
                    books.set(secondIndex, currentBook);

                }
            } else if ("Insert".equals(command)) {
                String currentBook = input.split("\\|")[1];
                if (!books.contains(currentBook)) {
                    books.add(currentBook);
                }
            } else if ("Check".equals(command)) {
                int currentBookIndex = Integer.parseInt(input.split("\\|")[1]);
                if (currentBookIndex >= 0 && currentBookIndex < books.size()) {
                    System.out.println(books.get(currentBookIndex));
                }
            }
            input = scanner.nextLine();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < books.size()-1; i++) {
            stringBuilder.append(books.get(i)+", ");
        }
        stringBuilder.append(books.get(books.size()-1));
        System.out.println(stringBuilder.toString().trim());

    }

}