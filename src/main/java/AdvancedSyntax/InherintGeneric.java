package AdvancedSyntax;

public class InherintGeneric {
    public static void main(String[] args) {
        /**
         * 参考这个链接
         * https://blog.csdn.net/ShierJun/article/details/51253870
         *
         * 问题：默认的 toString 是怎么写的？
         */
        Father<Integer> father = new Father<>(2);   // 利用泛型类生成对象的时候，必须在后面加上一个 <>
                                                         //  和生成 ArrayList 是同一个道理
        Father father1 = new Father<>(2);           // 自动推断类型

        System.out.println(father1);                     // 如果不写 toString 这个方法，则会返回一个内存位置，如 AdvancedSyntax.Father@61bbe9ba
                                                         // 如果写了 toString 这个方法，则会自动调用这个方法

        Son3<String, Integer> son3 = new Son3<>("时琳", 18);

        System.out.println("This is son3 " + son3);

    }
}
