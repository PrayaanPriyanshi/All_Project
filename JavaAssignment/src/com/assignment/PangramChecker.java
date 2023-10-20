package com.assignment;

public class PangramChecker {
	public static void main(String[] args) {
        String sentence = "My name is Manisha";
        
        boolean isPangram = checkPangram(sentence);
        
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean checkPangram(String sentence) {
        // Create an array to track the occurrence of each letter
        boolean[] isLetterPresent = new boolean[26];
        int count = 0;
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
            }
            if ('a' <= ch && ch <= 'z') {
                int index = ch - 'a';
                if (!isLetterPresent[index]) {
                    isLetterPresent[index] = true;
                    count++;
                }
            }
        }

        // If count is 26, all letters a to z are present
        return count == 26;
    }
}
