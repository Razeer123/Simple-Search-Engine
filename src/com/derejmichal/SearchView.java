package com.derejmichal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchView {

    static List<String> inputList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static StringEngine engine = new StringEngine();
    static int choice;

    public static void getValues() {

        System.out.println("Enter the number of people:");
        int inputNumber = scanner.nextInt();

        System.out.println("Enter all people:");
        scanner.nextLine();
        for (int i = 0; i < inputNumber; i++) {
            inputList.add(scanner.nextLine());
        }

    }

    public static void menu() {

        System.out.println();
        System.out.println("=== Menu ===");
        System.out.println("1. Find a person");
        System.out.println("2. Print all people");
        System.out.println("0. Exit");

        choice = scanner.nextInt();

        switch (choice) {

            case 1:

                System.out.println();
                System.out.println("Enter a name or e-mail to search all suitable people.");
                scanner.nextLine();
                String query = scanner.nextLine();
                List<Integer> result = engine.findIndexesArray(inputList, query);

                if (result.isEmpty()) {
                    System.out.println("No matching values people.");
                } else {
                    System.out.println();
                    System.out.println("Found people:");
                    for (Integer integer : result) {
                        System.out.println(inputList.get(integer));
                    }
                }

                result.clear();
                break;

            case 2:

                System.out.println();
                System.out.println("=== List of people ===");
                for (String string : inputList) {
                    System.out.println(string);
                }
                break;

            case 0:

                System.out.println();
                System.out.println("Bye!");
                System.exit(0);

            default:

                System.out.println();
                System.out.println("Incorrect option! Try again.");
                break;
        }

        menu();

    }
}
