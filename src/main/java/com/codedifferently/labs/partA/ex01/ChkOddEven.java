package com.codedifferently.labs.partA.ex01;

import java.util.Scanner;

public class ChkOddEven {
    public static String oddEven(int num){
        String response = "";

        if (num %2 == 0) {
            response = "The num is even " + num;
        }else {
            response = "The num is odd " + num;
        }

        return response;
    }
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number between 1 and 10:");
        num = in.nextInt();


        if (num >= 1 && num <= 10) {
            String result = oddEven(num);
            System.out.println(result);
        }else {
            System.out.println("Please enter a number between 1 and 10.");
        }

        in.close();
    }
}
