package com.derejmichal;

public class StringEngine {

    private final String inputLine;
    private final String toSearch;

    public StringEngine(String inputLine, String toSearch) {
        this.inputLine = inputLine;
        this.toSearch = toSearch;
    }

    public void findWordIndex() {

        String[] wordList =  inputLine.split(" ");
        int index = 0;

        for (int i = 0; i < wordList.length; i++) {
            if (wordList[i].equals(toSearch)) {
                index = i + 1;
            }
        }

        if (index == 0) {
            System.out.println("Not Found");
        } else {
            System.out.println(index);
        }
    }
}
