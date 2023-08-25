package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a quote: ");

        String Quote = input.nextLine();
        input.close();
        char[] quoteCharArr = Quote.toCharArray();
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char letter : quoteCharArr) {
            if (charCounts.containsKey(letter)){
                charCounts.put(letter, charCounts.get(letter) + 1);
            } else {
                charCounts.put(letter,1);
            }
        }
        for (Map.Entry<Character, Integer> charCount : charCounts.entrySet()) {
            System.out.println(charCount.getKey() + " : " + charCount.getValue());
        }
    }
}
