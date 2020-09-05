package com.derejmichal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringEngine engine = new StringEngine();
        System.out.println("Enter the number of people:");
        int inputNumber = scanner.nextInt();
        List<String> inputList = new ArrayList<>();

        System.out.println("Enter all people:");
        scanner.nextLine();
        for (int i = 0; i < inputNumber; i++) {
            inputList.add(scanner.nextLine());
        }

        System.out.println();
        System.out.println("Enter the number of search queries:");
        int numberQueries = scanner.nextInt();
        String query;
        scanner.nextLine();

        for (int i = 0; i < numberQueries; i++) {

            System.out.println();
            System.out.println("Enter data to search people:");
            query = scanner.nextLine();
            List<Integer> result = engine.findIndexesArray(inputList, query);

            if (result.isEmpty()) {
                System.out.println("No matching people found.");
            } else {
                System.out.println();
                System.out.println("Found people:");
                for (Integer integer : result) {
                    System.out.println(inputList.get(integer));
                }
            }

            result.clear();

        }
    }
}

