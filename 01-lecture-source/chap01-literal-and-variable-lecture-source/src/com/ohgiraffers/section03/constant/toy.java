package com.ohgiraffers.section03.constant;

class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

public class toy {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("boby");  // 메서드 호출
        System.out.println(cat.name);

    }
}


