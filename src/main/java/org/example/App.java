package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        String name;
        Random randomWinner = new Random();

        do
        {
            System.out.print("Enter a name: ");
            name = scan.nextLine();
            names.add(name);
        }
        while (!name.isEmpty());
        {
            names.remove(names.size() - 1);
        }
        System.out.println("The winner is... " + names.get(randomWinner.nextInt(names.size())) + ".");

        scan.close();
    }
}
