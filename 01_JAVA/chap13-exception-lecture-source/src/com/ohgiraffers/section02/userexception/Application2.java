package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(-50000, 30000);
        } catch (PriceNegativeException e) {
            throw new RuntimeException(e);
        } catch (MoneyNegativeException e) {
            throw new RuntimeException(e);
        } catch (NotEnoughMoneyException e) {
            throw new RuntimeException(e);
        }finally {
            /* 예외 발생 여부와 상관없이 실행 */
            System.out.println("finally 블럭 내용이 동작함...");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
