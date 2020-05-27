package Guava;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import java.util.Arrays;
import java.util.List;

public class ImmutableTest {
    public static void main(String[] args) {
        // https://blog.csdn.net/qq_27093465/article/details/78470696
        ImmutableList<String> test1 = ImmutableList.<String>builder().add("HELLO").build();
        List<String> test2 = new ImmutableList.Builder<String>().add("ffff").build();
    }
}
