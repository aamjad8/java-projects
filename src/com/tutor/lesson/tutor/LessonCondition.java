package com.tutor.lesson.tutor;

public class LessonCondition {
    public static void main(String[] args) {
        canVote(12);
        canVote(23);
        //System.out.println(canVoteAndReturn(10)==true?" Can Vote":"Can not vote");
        System.out.println("Age 18 can vote "+canVoteAndReturn(3));

        System.out.println(canVoteAndReturnString(100   ));
    }


    static void canVote(int age){
        if(age>=18){
            System.out.println("Welcome, you can vote!");
        }else{
            System.out.println("Sorry, you cannot vote.");
        }
    }

    static boolean canVoteAndReturn(int age){
        if(age>=18){
            return true;
        }else{
            return false;
        }
    }

    static String canVoteAndReturnString(int age){
        if(age>=18){
            return "Welcome, this person can vote";
        }else{
            return "Sorry, this person can not vote";
        }
    }
}
