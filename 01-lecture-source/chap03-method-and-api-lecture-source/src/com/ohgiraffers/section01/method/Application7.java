package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {
        /* 수업목표. 매개변수와 리턴값을 복합적으로 활용하는 것을 이해하고 활용할 수 있다.*/
        /*
        * 매개변수와 리턴값 복합활용
        * 매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하며 간단한 계산기 만들기
        * */
        Application7 app7 = new Application7();

        int num1 = 20;
        int num2 = 10;
        System.out.println("두 수를 더한 결과 : " + app7.plus(num1, num2));
        System.out.println("두 수를 뺀 결과 : " + app7.minus(num1, num2));
        System.out.println("두 수를 곱한 결과 : " + app7.multiple(num1, num2));
        System.out.println("두 수를 나눈 결과 : " + app7.divide(num1, num2));


    }

    public int plus(int num1, int num2){
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiple(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
