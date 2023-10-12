package com.programs;

import java.util.HashMap;
import java.util.Map;

public class RomanNumToInteger {
        public static void main(String[] args) {
            String romanNumeral = "XIV"; // Replace with your Roman numeral input

            int result = romanToInt(romanNumeral);
            System.out.println("The integer value of " + romanNumeral + " is: " + result);
        }

        public static int romanToInt(String s) {
            Map<Character, Integer> romanValues = new HashMap<>();
            romanValues.put('I', 1);
            romanValues.put('V', 5);
            romanValues.put('X', 10);
            romanValues.put('L', 50);
            romanValues.put('C', 100);
            romanValues.put('D', 500);
            romanValues.put('M', 1000);

            int result = 0;
            int prevValue = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
                char currentChar = s.charAt(i);
                int currentValue = romanValues.get(currentChar);

                // If the previous value is smaller than the current value, subtract it
                if (prevValue > currentValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }

                prevValue = currentValue;
            }

            return result;
        }
    }
