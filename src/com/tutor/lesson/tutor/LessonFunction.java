package com.tutor.lesson.tutor;

public class LessonFunction {
    public static void main(String[] args) {
        addition(10,20);
        addition(20,30);
        addition(10000000,454325324);

        addition(20,333,453453);

        bigAddition(3452345233434345L, 35242424390899L);

        System.out.println("Result of this return function is " + additionAndReturn(10000,2000000));


        char lastCharater='Z';
        boolean canVote=false;
        String canVote1="True";
    }

    static int additionAndReturn(int num1, int num2){
        return num1+num2;
    }

    static void addition(int num1, int num2){
        int sum=num1+num2;
        System.out.println("Sum of two numbers is: "+sum);
        System.out.println("Sum of "+num1+" and "+num2+" is: "+sum);
    }

    static void bigAddition(long num1, long num2){
        long sum=num1+num2;
        System.out.println("Sum of "+num1+" and "+num2+" is: "+sum);
    }



    static void addition(int num1, int num2, int num3){
        int sum=num1+num2+num3;
        System.out.println("Sum of three numbers is: "+sum);

    }



    //TODO:  create a function for substration, multiplication and division
}
