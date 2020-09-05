package com.derejmichal;

import java.util.ArrayList;
import java.util.List;

public class StringEngine {

    public boolean findWord(String inputLine, String toSearch) {

        String[] wordList =  inputLine.split(" ");
        int index = 0;

        for (int i = 0; i < wordList.length; i++) {
            if (wordList[i].toLowerCase().replace(" ", "").contains(toSearch.toLowerCase())) {
                index = i + 1;
            }
        }

        return index != 0;
    }

    public List<Integer> findIndexesArray(List<String> inputList, String query) {

        List<Integer> intList = new ArrayList<>();

        for (int i = 0; i < inputList.size(); i++) {
            if (findWord(inputList.get(i), query)) {
                intList.add(i);
            }
        }

        return intList;
    }
}
