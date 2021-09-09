package com.plurasight.Project1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       info();
       budget();
        time();
       distance();

    }

    public static void info() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String place = input.nextLine();
        System.out.println("Great!!" + place + " sounds like a great trip");
    }

    public static void budget() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int day = input.nextInt();
        System.out.print("How much money , in USD your planning to spend on trip ");
        double money = input.nextDouble();
        System.out.print("what is three letter currency symbol for your travel destination ");
        String currency = input.next();
        System.out.print("How many " + currency + " are there in 1 USD ");
        double USD = input.nextDouble();
        int hour = day*24;
        int mint = hour*60;
        System.out.println("If you are travelling for "+day+" days that is the same as "+hour+" hours or "+mint+" minutes");
        double spent=money/day;
        double budg =money*USD;
        double dget =budg/day;
        System.out.println("If you are going to spend "+money+" USD that means per day you can spend up to "+spent+" USD");
        System.out.println("Your total budget in  "+currency+" is "+budg +" "+currency+" which per day is "+dget+" "+currency);
    }

        public static void  time(){
        System.out.print("What is the time difference,in hours,between your home and your destination ");
            Scanner input=new Scanner(System.in);
            double zone = input.nextInt();
            System.out.println("That means when it is midnight at home it will be "+zone+" in your travel destination");
            double tzone = (zone+24) % 24;
            System.out.println("and when it is noon at home it will be "+tzone);
        }

    public static void distance() {
        System.out.print("What is the square area of your destination country in kms? ");
        Scanner input = new Scanner(System.in);
        double dinput= input.nextDouble();
        double dis = dinput * 0.1623;
        System.out.println("In miles that is " + dis);
    }
}
