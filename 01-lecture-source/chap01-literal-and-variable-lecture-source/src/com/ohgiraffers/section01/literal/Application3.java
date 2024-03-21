package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표 문자열 합치기 결과를 예측하고 사용할 수 있다 */
        /* 목차 1. 두 개의 문자열 합치기 */
        System.out.println("==========두 개의 문자열 합치기==========");
        System.out.println(9 + 9); // 18
        System.out.println("9" + "9"); // 99
        System.out.println("9" + 9); // 99
        System.out.println(9 + "9"); // 99

        /* 목차 2. 세 개의 문자열 합치기 */
        System.out.println("==========세 개의 문자열 합치기==========");
        System.out.println("9" + 9 + 9); // 999
        System.out.println(9 + "9" + 9); // 999
        System.out.println(9 + 9 + "9"); // 189
        // + 연산은 왼쪽에서 오른쪽으로 수행되기 때문이다
        System.out.println("9" + (9 + 9)); // 918

        /* 목차 3. 문자열 합치기 응용 */
        /* 10과 20의 사칙연산 결과를 출력하세요 */
        System.out.println("==========10과 20의 사칙연산 결과==========");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("==========10과 20의 사칙연산 결과를 보기 좋게 출력==========");
        System.out.println("10 + 20 =  " + (10 + 20));
        System.out.println("10 - 20 = " + (10 - 20));
        System.out.println("10 * 20 = " + 10 * 20);
        System.out.println("10 / 20 =   " + 10 / 20);
        System.out.println("10 % 20 =  " + 10 % 20);

        System.out.println("기차");
        System.out.println("기차" + "칙칙폭폭");
        System.out.println("기차" + 123 + 45 + "칙칙폭폭");
        System.out.println(123 + 45 + "기차" + "출발");
    }
}
