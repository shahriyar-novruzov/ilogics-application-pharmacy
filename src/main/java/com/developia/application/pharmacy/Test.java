package com.developia.application.pharmacy;


import java.util.Scanner;

/**
 * Created by shnovruzov on 28/02/2019.
 */


public class Test {


    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        String s = String.valueOf(num);

        boolean isPalindrome = true;
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        System.out.println(isPalindrome);

    }
}
