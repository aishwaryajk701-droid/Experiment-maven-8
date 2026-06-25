package com.example;

public class Main {
    public int add(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        Main m = new Main();
        int result = m.add(5,5);
        System.out.println("Sum is :"+result);
    }
}