package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {

        /* 수업목표. 메소드 리턴에 대해 이해할 수 있다. */
        /* return이란?
         * 모든 메소드 내부에는 리턴이 존재한다.
         * void 메소드의 경우에는 리턴을 명시하지 않아도 마지막줄에 컴파일러가 자동으로 추가해준다.
         * return은 현재 메소드를 강제종료하고 호출한 구문으로 다시 돌아가는 명령어이다.
         * */

        System.out.println("main()메소드 시작함");

        /* 1. 메소드 리턴 테스트 */
        Application5 app5 = new Application5();
        app5.testMethod();


        System.out.println("main()메소드 종료함");
    }

    public void testMethod() {

        System.out.println("테스트 메소드 동작 확인...");

        /* 컴파일러에 의해 자동으로 추가되는 구문이다.
         * 가장 마지막 작성하고, 마지막에 작성되지 않을 경우는 컴파일 에러를 발생시킵니다.
         * */

        return;

        /* 에러발생. return은 메소드 가장 마지막에 작성해야한다.
         * System.out.println(); */

    }
}
