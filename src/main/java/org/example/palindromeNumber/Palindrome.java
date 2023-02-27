package org.example.palindromeNumber;


public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int x) {
        String text = Integer.toString(x);
        for (int i = 0; i < text.length()/2; i++) {
            if (text.charAt(i) != text.charAt(text.length()-1-i)) return false;
        }
        return true;
    }
}
