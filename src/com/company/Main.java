package com.company;

// class
public class Main {

// method
    public static void main(String[] args) {

// declare input integer(s)
        // integer to run up to
        int num = 175;
        // first divisible integer
        int div1 = 3;
        //second divisible integer
        int div2 = 5;

// loop to iterate forward (positive) starting at integer 1
        for (int i = 1; i <= num; i++) {

// fizzbuzz if divisible by both div1 and div2 integers (use modulus - remainder is 0)
            if (((i % div1) == 0) & ((i % div2) == 0))
                System.out.println("fizzbuzz");

// fizz if divisible by div1 integer "fizz" (use modulus - remainder is 0)
            else if ((i % div1) == 0)
                System.out.println("fizz");

// buzz if divisible by div2 integer "buzz" (use modulus - remainder is 0)
            else if ((i % div2) == 0)
                System.out.println("buzz");

// integer if not a multiple of either div1 or div2
            else
                System.out.println(i);
            }
        }
    }
