package com.test2;

import com.ohgiraffers.test1.TestMethod;

import static com.ohgiraffers.test1.TestMethod.TestRandom;

public class Application {
    public static void main(String[] args) {
        TestMethod testM = new TestMethod();
        testM.Calculator(2, 5);
        int radius = 5;
        System.out.println("반지름이 " + radius + "인 원의 넓이는 " + testM.CircleArea(5) + "입니다.");
        System.out.println(TestRandom());

    }
}
