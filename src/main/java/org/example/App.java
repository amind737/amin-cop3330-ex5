/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dharik Amin
 */

package org.example;
import java.util.Scanner;
public class App 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the first number? ");
        int num1 = sc.nextInt();

        System.out.println("What is the second number? ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));

    }
}
