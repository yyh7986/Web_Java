package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 변수에 선언하고 값을 할당하여 사용할 수 있다 */
        /* 변수를 사용하는 방법
        *  1. 변수를 준비한다 (선언)
        *  2. 변수에 값을 대입한다 (값 대입 및 초기화)
        *  3. 변수를 사용한다.
        * */

        /* 자료형이란?
        *  다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다
        *  예) 앞에서 사용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속이다
        *       이러한 자료형은 기본자료형(Primary type)과 참조자료형(Reference type)으로 나누어진다
        *       그 중 기본자료형 8가지부터 살펴보기로 한다.
        * */

        /* 목차 1-1-1 숫자를 취급하는 자료형 */
        /* 정수 자료형 4가지 */
        byte bnum;  // 1byte
        short snum; // 2byte
        int inum;   // 4byte
        long lnum;  // 8byte

        /* 실수 자료형 2가지 */
        float fnum; // 4byte
        double dnum;// 8byte

        /* 목차 1-1-2. 문자를 취급하는 자료형 */
        /* 문자 자료형 1가지 */
        char ch;    // 2byte

        /* 목차 1-1-3. 논리값 자료형 */
        boolean isTrue; // 1byte

        /* 이상 8가지를 자료형이라 한다. */

        /* 목차 1-1-4. 문자열 자료형*/
        String str;     // 4byte (주소값은 4byte 정수값)

        /* 2. 변수에 값을 대입 */

        /* 목차 2-1. 정수형 변수에 값 대입 */
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L;

        /* 2-2. 실수형 변수에 값 대입 */
        // fnum = 4.0;
        fnum = 4.0f;
        dnum = 8.0;

        /* 2-3. 문자형 변수에 값 대입 */
        ch = 'a';
        char ch2 = 97;

        /* 2-4 논리형 변수에 값 대입*/
        isTrue = true;
        isTrue = false;

        /* 2-5 문자열 변수에 값 대입 */
        str = "HelloWorld";

        /* 일반적으로 사용하는 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표자료형이라고 하며
        *  정수는 int 실수는 double이 대표 자료형이다
        * */

        /* 목차 3 변수를 사용한다*/
        /* 변수에 저장된 값을 출력*/
        System.out.println("==========변수에 저장된 값을 출력==========");
        System.out.println("bnum의 값 출력 : " + bnum);
        System.out.println("snum의 값 출력 : " + snum);
        System.out.println("inum의 값 출력 : " + inum);
        System.out.println("lnum의 값 출력 : " + lnum);

        System.out.println("fnum의 값 출력 : " + fnum);
        System.out.println("dnum의 값 출력 : " + dnum);

        System.out.println("ch의 값 출력 : " + ch);
        System.out.println("ch2의 값 출력 : " + ch2);

        System.out.println("isTrue의 값 출력 : " + isTrue);

        System.out.println("str의 값 출력 : " + str);
    }
}
