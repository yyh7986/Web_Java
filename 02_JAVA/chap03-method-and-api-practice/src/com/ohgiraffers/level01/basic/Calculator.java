package com.ohgiraffers.level01.basic;

public class Calculator {
    public static void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public static int sumTwoNumber(int a, int b){
        return a + b;
    }

    public static int minusTwoNumber(int a, int b){
        return a - b;
    }

    public static int multiTwoNumber(int a, int b){
        return a * b;
    }

    public static int divideTwoNumber(int a, int b) {
        return a / b;
    }

    /*public void sumTwoNumber(int a, int b) {
        System.out.println(a + "과 " + b + "의 합 : " + (a + b));
        return;
    }*/
}
