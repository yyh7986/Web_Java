package com.ohgiraffers.section01.method;

import jdk.jfr.MemoryAddress;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. 여러개의 전달인자를 이용한 메소드를 호출할 수 있다. */
        /* 여러 개의 전달인자를 이용한 메소드 호출 테스트 */

        /* 1. 여러 개의 매개변수를 가진 메소드 호출 */
        Application4 app4 = new Application4();
        app4.testMethod("홍길동", 20, '남');
        /* 값의 개수는 맞지만 순서가 다르게 전달되면 호출할 수 없다.
        * app4.testMethod(20, "유관순", '여'); */

        /* 2. 변수에 저장된 값을 전달하여 메소드 호출*/
        String name = "유관순";
        int age = 20;
        char gender = '여';

        app4.testMethod(name, age, gender);
    }

    public void testMethod(String name, int age, final char gender){

        /*
        * 매개변수도 일종의 지역변수로 분류된다.
        * 매개변수도 final 키워드를 사용할 수 있다
        * 지역변수에서 final 키워드를 붙여 상수를 만드는 것과 동일하다
        * final의 매개변수는 상수 네이밍 규칙을 선택적으로 따르는 경항이 있다.
        * */
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며 성별은 " + gender +"입니다.");
    }
}
