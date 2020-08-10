package com.derejmichal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String word = scanner.nextLine();

        StringEngine engine = new StringEngine(inputLine, word);
        engine.findWordIndex();

    }
}

