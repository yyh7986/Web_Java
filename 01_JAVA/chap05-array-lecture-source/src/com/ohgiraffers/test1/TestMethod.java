package com.ohgiraffers.test1;

public class TestMethod {
    public void Calculator(int num1, int num2) {
        System.out.printf("num1 + num2 = %d%n", num1 + num2);
        System.out.printf("num1 - num2 = %d%n", num1 - num2);
        System.out.printf("num1 * num2 = %d%n", num1 * num2);
        System.out.printf("num1 / num2 = %d%n", num1 / num2);
        System.out.println("num1 " + '%' + " num2 = " + num1 % num2);
    }

    public double CircleArea(double radius){
        final double PI = 3.14;
        double cArea = PI * (radius * radius);
        return cArea;
    }

    public static String TestRandom(){
        int randomNumber = (int)(Math.random() * 10) + 1;
        String sent = "생성된 난수는 " + randomNumber + "입니다.";
        return sent;
    }
}