package com.assignment;

public class RomanInteger {
	 public static void main(String[] args) {
	        String roman = "IX"; 

	        int result = romanToInteger(roman);
	        System.out.println("Roman numeral " + roman + " is equivalent to " + result);
	    }

	    public static int romanToInteger(String s) {
	        int result = 0;
	        int prevValue = 0;

	        for (int i = s.length() - 1; i >= 0; i--) {
	            char c = s.charAt(i);
	            int currentValue = 0;

	            switch (c) {
	                case 'I':
	                    currentValue = 1;
	                    break;
	                case 'V':
	                    currentValue = 5;
	                    break;
	                case 'X':
	                    currentValue = 10;
	                    break;
	                case 'L':
	                    currentValue = 50;
	                    break;
	                case 'C':
	                    currentValue = 100;
	                    break;
	                case 'D':
	                    currentValue = 500;
	                    break;
	                case 'M':
	                    currentValue = 1000;
	                    break;
	                default:
	                    return -1; // Invalid Roman numeral
	            }

	            // If the current value is less than the previous value, subtract it
	            if (currentValue < prevValue) {
	                result -= currentValue;
	            } else {
	                result += currentValue;
	            }

	            prevValue = currentValue;
	        }

	        return result;
	    }
}
