package com.ohgiraffers.section05.logical;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 논리연결연산자의 진리표에 대해 이해할 수 있다. */
        /*
        * AND 연산과 OR 연산의 특징
        * 논리식 && 논리식 : 둘다 true 일 때 실행
        * 논리식 || 논리식 : 하나 이상 true 일 때 실행
        * */

        /* 1. 논리식 && 논리식 : 앞의 결과가 false이면 실행 안 함*/
        /*
        *  조건식 두 개가 모두 만족되어야 true를 반환하지만 앞에 미리 false가 나오게 되면
        *  뒤의 조건을 확인할 필요없이 false를 반환한다
        *  따라서 연산 횟수를 줄이기 위해서는 &&연산의 경우 앞에 false가 나올 가능성이 높은 조건을 작성하는 것이 좋다
        * */

        int num1 = 10;
        int result = (false && ++num1 > 0) ? num1 : num1;

        System.out.println("&&실행 확인 : " + result);

        /* 2. 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함 */
        /* 조건식 둘 중 하나라도 true 값이면 true를 반환하기 때문에 앞에서 미리 true가 나오게 되면
        *  뒤의 조건을 확인할 필요없이 true를 반환한다
        *  따라서 연산의 횟수를 줄이기 위해서는 || 연산의 경우 true가 나올 가능성이 높은 조건을 작성하는 게 좋다.
        * */

        int num2 = 10;

        int result2 = (true || ++num2 > 0) ? num2 : num2;

        System.out.println("||실행 확인 : " + result2);
    }
}
