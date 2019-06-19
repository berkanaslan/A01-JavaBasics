package com.berkanaslan.javabasics;

public class Statements {
    public static void main(String[] arg){

        int x=5;
        System.out.println(x);
        x=x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x=x*5;
        System.out.println(x);

        int y=4;

        System.out.println(x>y);
        System.out.println(y>x);

        y=30;
        System.out.println(y>x);
        System.out.println(y>=x);
        System.out.println(y==x);

        System.out.println(x!=y);

        // and &&
        // or ||

        x = 3;
        y = 4;
        int z = 5;

        System.out.println(x<y && y<z);
        System.out.println(x<y || z<y);

        //if statements

        if (x<y) {
            System.out.println("y is bigger");
        }
        else if (y<x) {
            System.out.println(" x ise bigger");
        }
        else {
            System.out.println("x=y");
        }

        //switch

        int day = 1;
        String dayString = "";

/*
        if (day==1){
            dayString="Monday";
        }
        else if (day==2){
            dayString="Tuesday";
        }
        else if (day==3) {
            dayString="Wednesday";
        }
        else {
            dayString="Thursday";
        }*/

        switch (day) {

            case 1:
                dayString="Monday";
                break;
            case 2:
                dayString="Tuesday";
                break;
            case 3:
                dayString="Wednesday";
                break;
            default:
                dayString="Thursday";
                break;
        }

        System.out.println(dayString);
    }
}
