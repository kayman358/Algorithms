/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author TN041502
 */
public class Algorithms {

    public static String cardMasking(String cardNumber) {
        String c = "";
        String s = "";

        String[] arrayOfCardNumbers = cardNumber.split("");
        int lengthOfCard = arrayOfCardNumbers.length;

        for (int i = 0; i < 6; i++) {
            c = c + arrayOfCardNumbers[i];
        }

        for (int j = 4; j > 0; j--) {
            s = s + arrayOfCardNumbers[lengthOfCard - j];
        }

        int numberOfStars = lengthOfCard - 10;
        String stars = "";
        if (numberOfStars > 0) {
            for (int k = 0; k < numberOfStars; k++) {
                stars = stars + "*";
            }
        }

        return c + stars + s;
    }

    public static String Binary(int decimalNumber) {

        int newdecimal = decimalNumber;
        int mod;
        String binary = "";
        while (newdecimal > 0) {
            mod = newdecimal % 2;
            newdecimal = newdecimal / 2;
            binary = binary + Integer.toString(mod);
        }

        int result = binary.length();
        String ret = "";
        for (int i = result - 1; i >= 0; i--) {
            ret = ret + binary.charAt(i);
        }
        return ret;
    }
    
    
    static int id = 0;

    public static boolean isPrime(long primeNumber) {
        boolean isPrime = true;
        for (int i = 2; 2 * i < primeNumber; i++) {
            if (primeNumber % i == 0) {
                id = i;

                return false;

            }
        }
        return isPrime;
    }

    public static int[] bubbleSort(int[] a) {

        int length = a.length;
        int t;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (a[i] > a[j]) {
                    t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String result = cardMasking(s);
        System.out.println("Result is " + result);
        String bina = Binary(808090);
        System.out.println("Binary result is " + bina);
        boolean testPrimality = isPrime(771734317);
        System.out.println("Prime is " + testPrimality);
        System.out.println("It is divisible by " + id);

        System.out.print("Please enter the array values");
        int len = input.nextInt();
        int[] aa = new int[len];
        for (int j = 0; j < len; j++) {
            aa[j] = input.nextInt();
        }
        int[] array = bubbleSort(aa);

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }

    }

}
