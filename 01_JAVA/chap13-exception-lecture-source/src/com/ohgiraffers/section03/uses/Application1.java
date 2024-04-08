package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("test.dat"));
            String s;
            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                /*
                * NullPointerException 이 발생한다
                * null을 참조하는 상태에서 참조 연산자를 사용시 발생하는 예외이다.
                * */
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}