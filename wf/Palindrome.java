package com.itrexgroup.wf;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        return word.equals(new StringBuilder(word).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
