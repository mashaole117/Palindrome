package com.palindrome;

import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Enter the word/phrase to be tested: ");

    String testPhrase = in.nextLine();
    String reverse = "",newTestPhrase;

    newTestPhrase = testPhrase.toLowerCase();
    newTestPhrase = newTestPhrase.replaceAll("\\W","");

    for (int i = newTestPhrase.length() - 1; i >= 0; i--) {
      reverse = reverse.concat(newTestPhrase.charAt(i) + "");
    }

    System.out.println("newTestPhrase = " + newTestPhrase);
    System.out.println("reverse = " + reverse);

    if (reverse.equals(newTestPhrase)) {
      System.out.println(testPhrase + " is a palindrome.");
    } else {
      System.out.println(testPhrase + " is not a palindrome.");

    }
  }

}