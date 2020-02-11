package AdvancedSyntax;

public class InherintGeneric {
    public static void main(String[] args) {
        /**
         * 参考这个链接
         * https://blog.csdn.net/ShierJun/article/details/51253870
         */
        Father<Integer> father = new Father<>(2);   // 利用泛型类生成对象的时候，必须在后面加上一个 <>
                                                         //  和生成 ArrayList 是同一个道理
        Father father1 = new Father<>(2);

        System.out.println(father1);

    }
}
