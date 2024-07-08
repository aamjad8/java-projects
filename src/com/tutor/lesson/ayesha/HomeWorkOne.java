package com.tutor.lesson.ayesha;

public class HomeWorkOne {
    public static void main(String[] args){
        subtraction(289, 756);
        multiplication(56, 87);
        division(97.4f, 74);
        remainder(97, 74);
    }
    static void subtraction(int num1, int num2){
        int difference = num1 - num2;
        System.out.println("The difference of " + num1 + " and " + num2 + " is " + difference);
    }
    static void multiplication(int num3, int num4){
        int product = num3 * num4;
        System.out.println("The product of " + num3 + " and " + num4 + " is " + product);
    }
    static void division(float num5, float num6){
        double quotient = num5/num6;
        System.out.println("The quotient of " + num5 + " and " + num6 + " is " + quotient);
    }
    static void remainder(int num5, int num6){
        double quotient = num5%num6;
        System.out.println("The remainder of " + num5 + " and " + num6 + " is " + quotient);
    }
}
