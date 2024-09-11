package app;

import utils.MathUtils;

public class Main {

    public static void main(String[] args) {
        int number = 5;
        int square = MathUtils .square(number);
        System.out.println("The square of " + number + " is: " + square);
    }
}
