package com.ohgiraffers.section04.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /* 순차정렬 */
        /*
        * 순차 정렬이란 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘으로
        * 배열의 처음과 끝을 탐색하면서 순차대로 정렬하는 가장 기초적인 정렬 알고리즘이다.
        * */

        int[] iarr = new int[10];
        for (int i = 0; i < iarr.length; i++) {
            iarr[i] = (int) (Math.random() * 100);
        }


        System.out.println("정렬 전");
        System.out.println(Arrays.toString(iarr));

        for (int i = 1; i < iarr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (iarr[j] > iarr[i]) {
                    int temp = iarr[j];
                    iarr[j] = iarr[i];
                    iarr[i] = temp;
                }
            }
        }
        System.out.println("정렬 후");
        System.out.println(Arrays.toString(iarr));
    }
}
