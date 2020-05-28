package LombokProject;

public class Main {
    public static void main(String[] args) {
        // 使用 builder 的目的是创建一个中间类，可以在这个中间类中写别的方法
        // 而且这个中间类中可以放

        // https://juejin.im/post/5c2088205188251920598d85
        /**
         * Only use RequiredArgsConstructor
         */
        TestLombok testLombok = new TestLombok("ShiLin", 18);
        System.out.println(testLombok.getName());

        /**
         * Use @lombok.Builder(
         */

        TestBuilder testBulder = TestBuilder.TestBuilderMethodName().testBuilderName("HELLO WORLD").build();
        System.out.println(testBulder.getTestBuilderName());

        TestBuilder testBuilder2 = new TestBuilder("Shilin");
        TestBuilder.TestBuilderClassName ttt = testBuilder2.toBuilder();
        ttt.testBuilderName("hezho").build();


        /**
         * Use @lombok.Builder at a method
         */
        TestLombokOnMethod testCombine = new TestLombokOnMethod();
        TestLombokOnMethod.TestLombokOnMethodBuilder testCombineBuilder = testCombine.toBuilder();
        TestLombokOnMethod testCombine1 = testCombineBuilder.name("SHILIN").build();
        System.out.println(testCombine1.getName());

        /**
         * Use @lombok.Builder and the RequiredArgsConstructor
         */

        TestCombine testCombine2 = TestCombine.create("hezho");
        // 如果要用 toBuilder，一定要有一个具体的对象才行
        TestCombine.TestCombineBuilder3 testCombineBuilder2 = testCombine2.toBuilder();

        TestCombine.TestCombineBuilder testCombineBuilder1 = TestCombine.testCombineBuilder();

        TestCombine testCombine3 = testCombineBuilder1.inputValue("hezho").build();  // 区别在这里，这里的 inputValue 是 create 的参数
        System.out.println(testCombine3.getName());

        // 也可以直接用静态方法生成。
        TestCombine testCombine4 = TestCombine.create2();




    }
}



