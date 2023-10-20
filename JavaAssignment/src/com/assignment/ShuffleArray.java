package com.assignment;

import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        // Define an array of integers to shuffle
        int[] array = {3, 6, 2, 8, 6, 3, 9, 4, 5, 2};

        // Call the shuffleArray function to shuffle the array
        shuffleArray(array);

        // Print the shuffled array
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    // Function to shuffle an integer array using the Fisher-Yates algorithm
    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        // Iterate through the array from the end to the beginning
        for (int i = n - 1; i > 0; i--) {
            // Generate a random index j between 0 and i
            int j = random.nextInt(i + 1);

            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
