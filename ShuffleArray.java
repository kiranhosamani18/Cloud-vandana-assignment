package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
    public class ShuffleArray {
        public static void main(String[] args) {
            // Create a list with the values (1, 2, 3, 4, 5, 6, 7)
            List<Integer> arrayList = new ArrayList<>();
            for (int i = 1; i <= 7; i++) {
                arrayList.add(i);
            }

            // Shuffle the list
            Collections.shuffle(arrayList);

            // Convert the shuffled list back to an array if needed
            Integer[] shuffledArray = arrayList.toArray(new Integer[0]);

            // Print the shuffled array or list
            for (Integer num : shuffledArray) {
                System.out.print(num + " ");
            }
        }
    }
