package Guava;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmutableTest {
    public static void main(String[] args) {
        // https://blog.csdn.net/qq_27093465/article/details/78470696
        // 两种不同的写法，区别在于 builder 和 new
        // 实际上就是 Builder 不用 lomok 而是手动写出来
        ImmutableList<String> test1 = ImmutableList.<String>builder().add("HELLO").build();
        List<String> test2 = new ImmutableList.Builder<String>().add("ffff").build();   // 使用

        // ImmutableSet 的 copyOf 将 ImmutableList 转换成 ImmutableSet
        List<String> test3 = new ArrayList<>();
        test3.add("1");
        test3.add("1");

        System.out.println(test3);
        ImmutableSet<String> test4 = ImmutableSet.copyOf(test3.iterator());
        System.out.println(test4);
    }
}
