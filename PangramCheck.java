package com.programs;

public class PangramCheck {
        public static void main(String[] args) {
            String input = "The quick brown fox jumps over the lazy dog";
            boolean isPangram = isPangram(input.toLowerCase()); // Convert to lowercase for case-insensitive check

            if (isPangram) {
                System.out.println("The input is a pangram.");
            } else {
                System.out.println("The input is not a pangram.");
            }
        }

        public static boolean isPangram(String input) {
            // Create an array to track if each letter has been encountered
            boolean[] alphabet = new boolean[26];

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                // Check if the character is a lowercase letter
                if (Character.isLetter(c) && c >= 'a' && c <= 'z') {
                    // Mark the corresponding index in the alphabet array as true
                    alphabet[c - 'a'] = true;
                }
            }

            // Check if all alphabet letters have been encountered
            for (boolean letter : alphabet) {
                if (!letter) {
                    return false; // If any letter is missing, it's not a pangram
                }
            }

            return true; // All letters have been encountered, it's a pangram
        }
    }
