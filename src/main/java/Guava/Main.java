package Guava;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 用来快速创建一个 MapAndFlatMap
        List<String> list = Lists.newArrayList("A","BA");
        ImmutableMap<Integer, String> uniqueIndex = Maps.uniqueIndex(list, String -> String.length());
        System.out.println(uniqueIndex.keySet());
        System.out.println(uniqueIndex);
    }
}
