package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 { // 깃허브 pull 받아서 다시 작성하기
    public static void main(String[] args) {
        /*
        * FileOutputStream
        * 프로그램 데이터를 파일로 내보내기를 위한 용도의 스트림이다
        * 1바이트 단위로 데이터를 처리한다.
        * */

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("src/com/ohgiraffers/section02/stream/testOutputStream.txt");
            fos.write(97);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
