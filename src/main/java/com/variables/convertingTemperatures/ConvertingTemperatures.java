package com.variables.convertingTemperatures;

public class ConvertingTemperatures {
    public static void main(String[] args){
        double fahrenheit = 808;
        double celsius = (fahrenheit - 32) * 5.0/9;
        System.out.println("In celsius: " + celsius);
    }
}
