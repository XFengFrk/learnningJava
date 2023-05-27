package com.learnjava.module_3;

public class TestVariable {
    public static void main(String[] args) {
        m(10);
        if (true) {
            C c1 = new C(30);
        }
    }
    static void m(int a) {// 1. 参数变量，作用范围从方法调用开始，直到方法调用结束
        int b = 20;// 2. 局部变量，作用范围从定义开始，到包围他的 “}” 为止，局部变量必须赋初始值才能使用
    }
}
class C {
    int c;// 3. 对象变量（成员变量），作用范围从对象创建开始，到对象不能用为止

    public C(int c) {
        this.c = c;
    }

    static int d = 40;// 4. 静态变量，作用范围从类加载开始到类卸载为止
}