/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Kolade Arowolo
 */
public class ReadTest {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        System.out.println("Asking for input...");
            Scanner scan = new Scanner(System.in);
            int integer = scan.nextInt();
            double dou = scan.nextDouble();
            scan.nextLine();
            String st = scan.nextLine();
            
            
            System.out.println(integer + i);
            System.out.printf("%.1f", d + dou);
            System.out.println();
            String out = s + st;
            System.out.println(out);

        
    }

}
