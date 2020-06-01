package Guava;

import com.google.common.collect.ImmutableTable;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultiTableTest {
    public static void main(String[] args) {
        // https://blog.csdn.net/yaomingyang/article/details/80935483
        ImmutableTable<Integer, Integer, Integer> table = ImmutableTable.<Integer, Integer, Integer>builder()
                .put(1, 2, 2)
                .put(1,3,3)
                .put(2,1,1)
                .put(2,2,2)
                .build();

        // rowMap 只是把 row 当做 key，然后把剩余的组成 key value pair 的 Map，作为 value
        System.out.println("The rowMap is");
        System.out.println(table.rowMap());
        System.out.println("The rowMap.values() is");
        // rowMap.values() 是把 rowMap 中的所有当做 value 的Map取出来
        System.out.println(table.rowMap().values());

        Collection<Map<Integer, Integer>> valueMapCollections = table.rowMap().values();

        // 把 Collection 转换成 List
        List<Map<Integer, Integer>> valueMapList = table.rowMap().values().asList();

        System.out.println("The rowMap.values() flatMap is");
        System.out.println(valueMapCollections.stream().flatMap(p->p.values().stream()).collect(Collectors.toList()));

        System.out.println("The set of rowMap.values() flatMap is");
        System.out.println(valueMapCollections.stream().flatMap(p->p.values().stream()).collect(Collectors.toSet()));

        // 如何返回一个 map ？？？

        // Stream.of 和 .stream 之间的区别是什么？？？
        System.out.println("The Stream.of rowMap.values() flatMap is");
        System.out.println(valueMapCollections.stream().flatMap(p->Stream.of(p.values())).collect(Collectors.toList()));
    }
}
