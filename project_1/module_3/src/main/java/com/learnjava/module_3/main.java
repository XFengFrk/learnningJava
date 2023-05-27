package com.learnjava.module_3;

import java.util.Scanner;

public class main {
    static Animal[] getAnimal(int type) {
        return new Animal[]{
                new Dog(type),
                new Cat(type)
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请选择叫声(“0”：狗叫，“1”：猫叫)：");
        int type = scanner.nextInt();

        Animal[] animals = getAnimal(type);
        animals[type].SayHi();
        return;
    }
}
