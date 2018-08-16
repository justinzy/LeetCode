package com.code.demo;

public class HelloWorld {

    private int i = 0;

    HelloWorld(int i) {
        this.i = i + 1;

        System.out.println("Int constructor i——this.i:  " + i + "——" + this.i);

        System.out.println("i-1:" + (i - 1) + " this.i+1:" + (this.i));
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("Hello World");
        HelloWorld tt = new HelloWorld(10);

    }
}
