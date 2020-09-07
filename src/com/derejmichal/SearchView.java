package com.derejmichal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchView {

    static List<String> inputList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static StringEngine engine = new StringEngine();
    static StringBuilder path = new StringBuilder();
    static int choice;

    // Reading Strings from file and adding them to a temporary list

    public static void readFile() {

        File file = new File(path.toString());

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNext()) {
                inputList.add(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + path.toString());
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
