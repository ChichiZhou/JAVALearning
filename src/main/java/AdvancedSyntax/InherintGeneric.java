package AdvancedSyntax;

import java.util.Arrays;
import java.util.List;

public class InherintGeneric {
    public static void main(String[] args) {
        /**
         * 参考这个链接
         * https://blog.csdn.net/ShierJun/article/details/51253870
         *
         * 问题：默认的 toString 是怎么写的？
         */
        Father<Integer> father = new Father<>(2);   // 利用泛型类生成对象的时候，必须在！！！！后面！！！！！加上一个 <> ！！！！
                                                         // ！！！！！！生成的时候也需要在等号前面加上 <Integer> ！！！！！！！！！！
                                                         // 目的是为了指明类型
                                                         // 和生成 ArrayList 是同一个道理

        Father father1 = new Father<>(2);           // 自动推断类型

        System.out.println(father1);                     // 如果不写 toString 这个方法，则会返回一个内存位置，如 AdvancedSyntax.Father@61bbe9ba
                                                         // 如果写了 toString 这个方法，则会自动调用这个方法

        Son3<String, Integer> son3 = new Son3<>("时琳", 18);

        System.out.println("This is son3 " + son3);

        List<Integer> arrayList = Arrays.asList(1,2,3,4,5);

        System.out.println("The toString results for a list is");
        System.out.println(arrayList.toString());          // 从这里可以看到 toString 该怎么写 （这里用到了 getClass() 和 getName()）

    }
}
