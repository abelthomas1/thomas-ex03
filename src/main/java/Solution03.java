/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Abel Thomas
 */

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args){
        /*
        prompt user to input a quote
        take input
        prompt user to input an author
        take input
        print a statement combining both quote and author with quotation marks around the quote
         */

        Scanner input = new Scanner (System.in);
        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        System.out.print("Who said it? ");
        String author = input.nextLine();

        System.out.println(author + " says, \"" + "" + quote + "\"");
    }
}
