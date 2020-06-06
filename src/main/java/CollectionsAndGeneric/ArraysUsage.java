package CollectionsAndGeneric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArraysUsage {
    public static void main(String[] args) {
        /**
         * Arrays 表示常规的对 Arrays 的操作，比如 排序 和 搜索
         */
        // 最常用的，把散落的 Object 组成一个 List
        List<String> stringList = Arrays.asList("HELLO", "WORLD");

        String[] original = new String[2];

        original[0] = "H";
        original[1] = "M";

        String[] testCopy = Arrays.copyOf(original, original.length);
        Arrays.stream(testCopy).forEach(p-> System.out.print(p));
        System.out.println("**************");

        // 第二个常用的是 stream
        // 这里只有如下的 stream 类型
        // DoubleStream; IntStream; LongStream
        Stream<String> testStream = Arrays.stream(testCopy);
    }
}
