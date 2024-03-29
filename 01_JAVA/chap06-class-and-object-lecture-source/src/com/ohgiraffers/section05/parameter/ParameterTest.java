package com.ohgiraffers.section05.parameter;

public class ParameterTest {
    public void testPrimaryType(int num) {
        System.out.println("매개변수로 전달 받은 값 = " + num);
    }

    public void testPrimaryTypeArray(int[] iarr){
        System.out.println("매개변수로 전달 받은 값 = " + iarr);
        System.out.print("배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
        iarr[0] = 99;

        System.out.print("변경된 배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    public void testClassType(RectAngle rectAngle) {
        System.out.println("매개변수로 전달받은 값 : " + rectAngle);

        System.out.println("========== 사각형의 넓이와 둘레 ==========");
        rectAngle.calcArea();
        rectAngle.calcRound();

        rectAngle.setWidth(200);
        rectAngle.setHeight(100);

        System.out.println("========== 변경 된 사각형의 넓이와 둘레 ==========");
        rectAngle.calcArea();
        rectAngle.calcRound();
    }

    public void testVariableLengthArray(String name, String... hobby) {

        System.out.println("이름 : " +name);
        System.out.println("취미의 갯수 : " +hobby.length);
        System.out.print("취미 : ");
        for (String s : hobby) {
            System.out.print(s + " ");
        }
    }

    public void testVariableLengthArray(String... hobby) {

        System.out.println("취미의 갯수 : " +hobby.length);
        System.out.print("취미 : ");
        for (String s : hobby) {
            System.out.print(s + " ");
        }
    }
}
