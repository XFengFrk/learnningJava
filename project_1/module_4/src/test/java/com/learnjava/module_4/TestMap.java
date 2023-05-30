package com.learnjava.module_4;

import java.util.HashMap;
import java.util.Map;

/**
 * Map
 *1. key(键) -> value(值), 键值对entry
 * 映射关系
 *2. 两个泛型，分别用来限制key和value的类型
 *3. Map.of:创建的是不可变Map，new HashMap():创建的是可变的Map集合
 *4. Map的增删查改
 *5. Map的遍历
 */
public class TestMap {

    public static void main(String[] args) {
        System.out.println(find_2("black"));
    }

    public static String find_2(String key) {
        /*Map<String, String> map = Map.of(
                "bright", "小明",
                "white","小白",
                "black", "小黑"
        );*/
        Map<String, String> map = new HashMap<>();
        map.put("bright", "小明");
        map.put("white", "小白");
        map.put("black", "小黑");// 可以新增(如果key在map中还不存在)，也可以修改(如果key在map中存在)

        map.remove("black");// 根据key删除

        map.entrySet();// 获取所有的键值对集合，可以用增强for循环遍历

        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println("key:" + e.getKey() + " value:" + e.getValue());
        }

        return map.get(key);// 根据key查询value值
    }

    public static String find_1(int key) {
        String[] array = new String[]{"小明", "小白", "小黑"};
        if (key < 0 || key >= array.length) {
            return null;
        }
        return array[key];
    }
    //find1("小明")
    /*public static String find1(String value) {
        String[] array = new String[]{"小明", "小白", "小黑"};
        for (String s : array) {
            if (s.equals(value)) {
                return s;
            }
        }
        return null;
    }*/
}
