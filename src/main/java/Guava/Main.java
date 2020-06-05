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
        // Function 也可以是 求P得P的
        ImmutableMap<String, String> uniqueIndexString = Maps.uniqueIndex(list, p->p);


        System.out.println(uniqueIndex.keySet());
        System.out.println(uniqueIndex);
        System.out.println("求P得P如下：");
        System.out.println(uniqueIndexString);
    }
}
