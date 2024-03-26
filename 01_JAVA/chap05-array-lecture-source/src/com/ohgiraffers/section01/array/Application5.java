package com.ohgiraffers.section01.array;

public class Application5 {

    public static void main(String[] args) {

        /* 수업목표. 배열을 사용하는 예시를 이해하고 적용할 수 있다.*/
        /* 랜덤한 카드를 한 장 뽑아서 출력해보자*/
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int randomShapeIndex = (int) (Math.random() * shapes.length);
        int randomCardNumIndex = (int)(Math.random()* cardNumbers.length);

        System.out.println("당신이 뽑은 카드는 " + shapes[randomShapeIndex] + " " + cardNumbers[randomCardNumIndex] + " 카드 입니다.");
    }


}
