package com.learnjava.module_3;

public class TestCircle {
    public static void main(String[] args) {
        Circle c_1 = new Circle(1.0);
        Circle c_2 = new Circle(2.0);

        System.out.println(c_1.area());
        System.out.println(c_2.area());
    }

    /**
     * 求圆的面积
     * @param r 圆的半径
     * @return
     */
//    static double area(double r) {
//        return 3.14 * r * r;
//    }
}
