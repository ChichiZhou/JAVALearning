package Guava;

import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
        // https://www.baeldung.com/java-merge-maps
        // 这里用到了 Map.Entry 作为 key - value pair
        System.out.println(
            valueMapCollections.stream().flatMap(map->map.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> (v1+v2)    /* 这个的作用是为了防止有两个重复的 key */
                ))
        );


        // Stream.of 和 .stream 之间的区别是什么？？？
        // https://www.geeksforgeeks.org/difference-between-stream-of-and-arrays-stream-method-in-java/
        // https://stackoverflow.com/questions/39874242/what-is-the-difference-between-stream-and-stream-of
        System.out.println("The Stream.of rowMap.values() flatMap is");
        System.out.println(valueMapCollections.stream().flatMap(p->Stream.of(p.values())).collect(Collectors.toList()));

        System.out.println("Difference between Stream.of and .stream()");
        int arr[] = { 1, 2, 3, 4, 5 };
        int arr1[] = { 1, 2, 3, 4, 5 };

        // --------- Using Arrays.stream() ---------

        // to convert int array into Stream
        IntStream intStream = Arrays.stream(arr);

        // Displaying elements in Stream
        intStream.forEach(str -> System.out.print(str + " "));
        System.out.println();

        List<String> testStringList = Arrays.asList("HELLO", "WORLD", "TEXAS");

        testStringList.stream().forEach(str -> System.out.print(str + " "));
        System.out.println();
        System.out.println("**********");

        // --------- Using Stream.of() ---------

        // to convert int array into Stream
        Stream<int[]> stream = Stream.of(arr, arr1);
        Stream testNewString = Stream.of(testStringList);
        testNewString.forEach(str -> System.out.print(str + " "));

        stream.flatMapToInt(Arrays::stream).forEach(str -> System.out.print(str + " "));
        System.out.println();
        System.out.println("**********");

        Stream<String> testStringStream = Stream.of("THIS", "IS", "TESTSTREAM");
        testStringStream.forEach(str -> System.out.print(str + " "));
        System.out.println();
        System.out.println("**********");

        List<String> test1 = Arrays.asList("1", "2");
        List<String> test2 = Arrays.asList("1", "2");

        List<String> result = Stream.of(test1, test2).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(result);
    }
}
