package com.learnjava.module_3;

public class Phone {
    // 类型 名字
    String brand; // 品牌
    String memory; // 内存
    String size; // 大小
    String color; // 颜色
    double price; // 价格
    boolean available;

    //构造方法是创建对象时被调用，作用：给对象的字段赋初始值
    // 1. 和类同名 2. 不加返回值类型声明
    /*
        方法名(参数) {
        }
     */
    /*Phone(String brand, String memory, String size, String color, double price) {
        this.brand = brand;
        this.memory = memory;
        this.size = size;
        this.color = color;
        this.price = price;
    }*/

    public Phone(String brand, String memory, String size, String color, double price) {
        this.brand = brand;
        this.memory = memory;
        this.size = size;
        this.color = color;
        this.price = price;
    }
}
