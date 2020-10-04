package com.gothosystems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println(number % 5 == 0 ? "FizzBuzz" : "Fizz");
        }
        else if (number % 5 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
