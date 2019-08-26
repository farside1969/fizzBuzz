package com.company;

// class
public class Main {

// method
    public static void main(String[] args) {

// declare input integer - maximum number to check up to
        int num = 100;
        int div1 = 5;
        int div2 = 7;

// loop forward starting at integer 1
        for (int i = 1; i <= num; i++) {

// set both of the multiple of integers
            if (((i % div1) == 0) & ((i % div2) == 0))
                System.out.println("fizzbuzz");

// is a multiple of lowest integer
            else if ((i % div1) == 0)
                System.out.println("fizz");

// is a multiple of th higher integer
            else if ((i % div2) == 0)
                System.out.println("buzz");

// is not a multiple of either integer
            else
                System.out.println(i);
            }
        }
    }
