package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase( word.charAt(0) ) + word.substring(1).toLowerCase();
    }

    public String generateInitials(String firstName, String lastName) {
        return String.valueOf( firstName.charAt(0) ).toUpperCase() + '.' + String.valueOf( lastName.charAt(0) );
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        return 0.0;
    }

    public String reverse(String sentence) {
        // Add your code here
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
