package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /* Queue에 대해 이해하고 사용할 수 있다
        *  선형 메모리 공간에 데이터를 저장하는
        *  선입선출(FIFO First Input First Out) 방식의 자료구조이다.
        *  대부분은 LinkedList를 사용
        * */

        /* 인터페이스이기 때문에 인스턴스 생성이 불가능하다. */
        Queue<String> que = new LinkedList<>();

        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        /*
        *  peek() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환한다.
        *  poll() : 해당 큐의 가장 앞에 있는 요소를 반환하고 제거한다.
        * */

        System.out.println("que.peek() = " + que.peek());
        System.out.println("que = " + que);

        System.out.println("que.poll() = " + que.poll());
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);

    }
}
