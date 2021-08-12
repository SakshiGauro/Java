package com.variables.assignment;

public class Assignment {
    public static void main(String[] args) {
        int dogs = 7;
        int cats = 15;

        System.out.println("1. Dogs: " + dogs);
        System.out.println("1. Cats: " + cats);

        cats = dogs;

        System.out.println("2. Dogs: " + dogs);
        System.out.println("3. Cats: " + cats);
    }
}
