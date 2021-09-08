package com.techreturners.exercise003;

import java.util.HashMap;
import java.util.Map;

public class Exercise003 {

    Map<String, Integer> iceCreamFlavourMap = new HashMap<String, Integer>() {
        {
            put("Pistachio", 0);
            put("Raspberry Ripple", 1);
            put("Vanilla", 2);
            put("Mint Chocolate Chip", 3);
            put("Chocolate", 4);
            put("Mango Sorbet", 5);
        }
    };

    int getIceCreamCode(String iceCreamFlavour) {
        return iceCreamFlavourMap.get(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
        String[] flavours = new String[iceCreamFlavourMap.size()];
        for (String key : iceCreamFlavourMap.keySet()) {
            flavours[iceCreamFlavourMap.get(key)] = key;
        }
        return flavours;

    }
}
