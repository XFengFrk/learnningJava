package com.learnjava.module_3;

public class TestInterface_2 {
    public static void main(String[] args) {
        E[] array = new E[] {
                new F(),
                new G()
        };
        for (int i = 0; i < array.length; i++) {
            E e = array[i];
            e.e();// 多肽
        }

    }
}

interface E {
    //默认方法
    /*default void e() {
        System.out.println("e");
    }*/

    //抽象方法：只有方法声明，没有方法体
    /*
    1. 只能是public，public abstract 都可以省略
    2. 为什么抽象方法设计为不需要方法体？
    3. 实现类，必须重写接口的抽象方法
     */
    public abstract void e();
}

class F implements E {
    @Override
    public void e() {
        System.out.println("f");
    }
}

class G implements E {
    @Override
    public void e() {
        System.out.println("g");
    }
}
