package com.learnjava.module_3;

public class Circle {
    double r;
//    static double pi = 3.14;
    public Circle(double r) {
        this.r = r;
    }

    /**
     *
     * @return 圆的面积
     */
    double area() {
        return Math.PI * r * r;
    }
}
