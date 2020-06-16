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

        TestBuilder testBuilder2 = new TestBuilder("Shilin");   // 原本是 Shilin
        TestBuilder.TestBuilderClassName ttt = testBuilder2.toBuilder();
        ttt.testBuilderName("hezho").build();       // 改了之后是 hezho


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

        TestCombine testCombine2 = TestCombine.create3("hezho");
        // 如果要用 toBuilder，一定要有一个具体的对象才行
        TestCombine.TestCombineBuilder3 testCombineBuilder2 = testCombine2.toBuilder();
        System.out.println("Combine is");
        System.out.println(testCombine2.getName());
        System.out.println("使用 toBuilder");
        System.out.println(testCombineBuilder2.name("Change the Name").build().getName());
//        TestCombine testTobuilder = TestCombine.toBuilder
        TestCombine testTobuilder1 = TestCombine.testCombineBuilder3().name("SHL").build();


        /**
         * 使用 builderMethodName 和 TestCombineBuilder
         */
        TestCombine.TestCombineBuilder testCombineBuilder1 = TestCombine.testCombineBuilder();

        TestCombine testCombine3 = testCombineBuilder1.inputValue("hezho").build();  // 区别在这里，这里的 inputValue 是 create 的参数

        System.out.println(testCombine3.getName());

        TestCombine useOneCommand = TestCombine.testCombineBuilder().inputValue("Shilin").build();
        System.out.println("可以把上述两行合并成一行");
        System.out.println(useOneCommand.getName());

        /**
         * 也可以直接用静态方法生成。
         */
        TestCombine testCombine4 = TestCombine.create2();

        TestCombine testCombine5 = TestCombine.testCombineBuilder3().name("LOVE SHILIN").build();
        System.out.println(testCombine5.getName());

        TestCombine testCombine6 = TestCombine.create3("HZH");
        System.out.println(testCombine6.getName());
    }
}



