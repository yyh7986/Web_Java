package com.ohgiraffers.section01.conditional;

public class Application1 {
    public static void main(String[] args) {
        A_if a = new A_if();
        /* 단독 if 문 흐름 확인용 메소드 출력*/
        // a.testSimpleIfStatement();

        /* 중첩 if 문 흐름 확인용 메소드 출력 */
        // a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();
        // b.simpleIfElseStatement();

        // b.testNestedIfElseStatement();

        C_ifElseIf c = new C_ifElseIf();
        // c.testSimpleIfElseIfStatement();
        c.testNestedIfElseIfStatement();
    }
}
