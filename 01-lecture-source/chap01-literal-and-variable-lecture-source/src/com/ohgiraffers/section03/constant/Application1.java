package com.ohgiraffers.section03.constant;

public class Application1 {

    public static void main(String[] args) {
        final int AGE;
        AGE = 20;
        /* 3. 필요한 위치에 상수를 호출하여 사용한다 */
        /* 3-1 출력 구문에서 사용 */
        System.out.println("AGE의 값 : " + AGE);
        /* 3-2 필요시에는 연산식에 호출하여 사용한다 */
        System.out.println("AGE의 2배" + (AGE * 2));

        /* 3-3 대입연산시 활용 */
        int sum = AGE;
        // AGE = AGE + 10;
    }
}
