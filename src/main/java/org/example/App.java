package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Harmin Jeong
 */
public class App 
{
    public static void main( String[] args )
    {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println( "What is your name!");
        name = input.nextLine();
        System.out.printf("Hello, %s, nice to meet you!", name);
    }
}
