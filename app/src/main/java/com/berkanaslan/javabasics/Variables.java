package com.berkanaslan.javabasics;

public class Variables {

    public static void main(String[] args) {

        //Variables
        //Integer
        int age=20;
        System.out.println(10*age);
        System.out.println(age/5);

        int x=5;
        int y=11;

        long myLong = 10;
        System.out.println(myLong/5);

        System.out.println(y/x);

        //Double - Float

        double z = 5.0;
        double a = 11.0;

        System.out.println(a/z);

        double pi = 3.14;
        int r = 5;

        System.out.println(2*r*pi);

        //String

        String name = "James";
        String surname = "Hetfield";
        System.out.println(name+" "+surname);

        //Boolean

        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);

        //Final

        final int myInteger = 4;
        System.out.println("MyInteger variable:"+myInteger);
        //myInteger = 5;
        System.out.println("MyInteger variable:"+myInteger);

    }
}
