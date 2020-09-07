package com.derejmichal;

public class Main {

    static StringBuilder filePath = new StringBuilder();

    public static void main(String[] args) {

        filePath.append("file.txt");

        // Stuff needed for JetBrains tests

        for (int i = 0; i < args.length; i += 2) {

            filePath.setLength(0);

            if ("--data".equals(args[i])) {
                filePath.append(args[i + 1]);
                break;
            } else {
                filePath.append("file.txt");
            }
        }

        SearchView.path = filePath;

        SearchView.readFile();
        SearchView.menu();

    }
}