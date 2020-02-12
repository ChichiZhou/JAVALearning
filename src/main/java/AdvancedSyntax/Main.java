package AdvancedSyntax;

public class Main {
    public static void main(String[] args) {
        /**
         * 泛型
         * 泛型引入之后，可以将类型当作参数来传递。因此不需要提前定义对象
         *
         * https://blog.csdn.net/qq564425/article/details/81327767
         *
         */
        System.out.println("\n************\n");
        Fruit fruit = new Fruit("Fruit");
        Apple apple = new Apple("Apple");
        Dog dog = new Dog("Dog");

        Generic<Fruit> o = new Generic<Fruit>();
        /**
         * 使用泛型类创建对象时，一定要说明类型
         *
         * 但是使用泛型方法时，不需要说明类型
         */
        System.out.println("-----------------演示一下show_1------------------");
        o.show_1(fruit);
        o.show_1(apple);
        //o.show_1(dog);这是不能编译通过的，因为此时o对象已限定为Fruit类
        System.out.println("-----------------演示一下show_2-----------------");
        o.show_2(fruit);
        o.show_2(apple);
        /**
         * 下面这种写法属于 显示类型声明
         */
        o.<Dog>show_2(dog);  // 这里通过传入一个类型参数来改变原本这个类所在的类型参数！！！！！
                            // 这种写法在 Stream, Operation 中都会见到。总之所有的 泛型都会见到
        System.out.println("-----------------演示show_3-------------------");
        o.show_3(fruit);
        o.show_3(apple);
        o.<Dog>show_3(dog);
    }
}
