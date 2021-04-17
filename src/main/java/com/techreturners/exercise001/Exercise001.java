package com.techreturners.exercise001;

import java.util.List;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase( word.charAt(0) ) + word.substring(1).toLowerCase();
    }

    public String generateInitials(String firstName, String lastName) {
        return String.valueOf( firstName.charAt(0) ).toUpperCase() + '.' + String.valueOf( lastName.charAt(0) );
    }

    public double addVat(double originalPrice, double vatRate) {
        DecimalFormat formatter = new DecimalFormat("#.00");
        return Double.parseDouble(formatter.format( originalPrice * (1 + vatRate / 100) ));
    }

    public String reverse(String sentence) {
        String reverseWords = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reverseWords = reverseWords + sentence.charAt(i); 
        }
        return reverseWords;  
    }
    
    public int countLinuxUsers(List<User> users) {
       // Add your code here
       return 0;
    }  

}
