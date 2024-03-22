package com.ohgiraffers.level01.basic;


public class Application1 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65
    }
    /* Application01
        int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
	1	System.out.println(y >= 5 || x < 0 && x > 2);
	2	System.out.println(y += 10 - x++);
	3	System.out.println(x+=2);
	4	System.out.println( !('A' <= c && c <='Z') );
	5	System.out.println('C'-c);
	6   System.out.println('5'-'0');
	7	System.out.println(c+1);
	8	System.out.println(++c);
	9	System.out.println(c++);
	10	System.out.println(c);

		System.out.println() 의 결과를 예측하고 이유를 설명하시오.
		*/

    /* Answer
     * 1번. (true || false && false) -> (true && false) -> false 출력
     * 2번. (y += 10 - x++) -> (15 - 2) -> 13 출력, x++ -> x = 3
     * 3번. (x += 2) -> (x = x + 2) -> (x = 3 + 2) -> 5 출력
     * 4번. (!('A' <= c && c <= 'Z')) -> (!(65 <= 65 && 65 <= 90)) -> (!(true && true)) -> (!true) -> false 출력
     * 5번. ('C' - c) -> (67 - 65) -> 2 출력
     * 6번. ('5' - '0') -> (5 - 0) -> 5 출력
     * 7번. (c + 1) -> (65 + 1) -> 66
     * 8번. (++c) -> 전위증감연산자로 연산 먼저 실행후 출력 되기때문에 c+1 이 되고 B가 출력, c = 'B'
     * 9번. (C++) -> 후위증감연산자로 실행 후 연산되기 때문에 B가 출력되고, c = 'C'
     *10번. 8, 9번 문제에서의 증감연산자로 인해 c값이 'C'로 변경되었기 때문에 C 출력
     * */
}
