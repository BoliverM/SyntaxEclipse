package com.syntax.class17;

import com.syntax.class16.Dog;

public class DogTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Jofy", "Russian", "Grey", 15, 20);

        Dog dog2 = new Dog("Foofy", "UK", "Grey", 18, 20);
        dog.printInfo();

    }
}