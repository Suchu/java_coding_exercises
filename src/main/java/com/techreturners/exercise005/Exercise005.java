package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!input.contains(String.valueOf(ch)))
                return false;
        }
        return true;
    }

}
