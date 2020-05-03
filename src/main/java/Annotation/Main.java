package Annotation;

public class Main {
    public static void main(String[] args) {
        /**
         * 使用 Builder 可以不必写构造函数，直接调用
         * ImplementBuilder.builder().foo(1).bar("One").build();
         * 这里要注意，需要头尾呼应
         * .builder() .... .build()
         */
        ImplementBuilder test = ImplementBuilder.builder().foo(1).bar("One").build();
        System.out.println(test.getFoo());
        System.out.println(test.getBar());

        ImplementSetter testImplementSetter = new ImplementSetter();
        testImplementSetter.setFoo(2);
        testImplementSetter.setBar("Two");

        ImplementBuilder2 testImplementBuilder2 = ImplementBuilder2.of(3, "Three");


    }
}
