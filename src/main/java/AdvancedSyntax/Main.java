package AdvancedSyntax;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n************\n");
        Fruit fruit = new Fruit();
        Apple apple = new Apple();
        Dog dog = new Dog();

        Generic<Fruit> o = new Generic<Fruit>();
        System.out.println("-----------------演示一下show_1------------------");
        o.show_1(fruit);
        o.show_1(apple);
        //o.show_1(dog);这是不能编译通过的，因为此时o对象已限定为Fruit类
        System.out.println("-----------------演示一下show_2-----------------");
        o.show_2(fruit);
        o.show_2(apple);
        o.<Dog>show_2(dog);  // 这里通过传入一个类型参数来改变原本这个类所在的类型参数
                            // 这种写法在 Stream, Operation 中都会见到。总之所有的 泛型都会见到
        System.out.println("-----------------演示show_3-------------------");
        o.show_3(fruit);
        o.show_3(apple);
        o.<Dog>show_3(dog);
    }
}
