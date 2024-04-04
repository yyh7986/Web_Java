package com.ohgiraffers.section02.extend;

// Animal은 interface지만 implements하면 에러남
// public class RabbitFarm<T implements  Animal> {} // ERROR
// public class RabbitFarm<T extends  Animal> {} // 정상
// public class RabbitFarm<T extends Rabbit & Animal>{}
    // <T extends 클래스 & 인터페이스>
    // <T extends 클래스 & 클래스> 혹은 <인터페이스 & 클래스>는 불가능
// public class RabbitFarm<T extends Rabbit, Snake> {}

public class RabbitFarm<T extends Rabbit> {
    private T animal;

    public RabbitFarm(){}
    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}

