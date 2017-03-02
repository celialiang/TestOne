package com;

import java.util.Objects;

/**
 * Created by Celia on 1/17/2017.
 */
public class TestEquals {
    public static void main (String args[]) {
        CatOne c1 = new CatOne(1, 2, 3);
        CatOne c2 = new CatOne(1, 2, 3);
        // 探测两只猫是否相同
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        // String里的equal方法被重写了
        System.out.println(s1.equals(s2));

    }
}

class CatOne{
    int color;
    int height, weight;

    // 构造方法,对应new CatOne() 里的参数
    public CatOne(int color, int height, int weight) {
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        else {
            if (obj instanceof CatOne) {
                // obj 强制转换成猫类型
                CatOne c = (CatOne) obj;
                if (c.color == this.color && c.height == this.height && c.weight == this.weight) {
                    return true;
                }
            }
        }
        return false;
    }
}
