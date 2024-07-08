package com.tutor.lesson.rushda;

public class HomeWork1 {
    public static void main(String[] args){
        subtraction (375, 245);
        multiplication (12, 12);
        division(369825.444445, 5.22222);
    }

    static void subtraction(int num1, int num2){
        int diff = num1 - num2;
        System.out.println("The difference of "+num1+" and "+num2+" is "+diff+".");

    }

    static void multiplication(int num1, int num2){
        int multiply = num1 * num2;
        System.out.println("The product of "+num1+" and "+num2+" is "+multiply+".");
    }

    static void division(double num1, double num2){
        double div = num1 / num2;
        System.out.println("The quotient of "+num1+" and "+num2+" is "+div+".");
    }
}
