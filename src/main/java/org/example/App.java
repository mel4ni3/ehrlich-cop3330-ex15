/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correct  = "abc$123";
        String password, username;
        System.out.println("Enter username:");
        username = scanner.nextLine();
        System.out.print("Enter password:");
        password = scanner.nextLine();

        if (password.equals(correct)) {
            System.out.print("Welcome!");
        }
        else {
            System.out.print("I don't know you.");
        }
    }
}