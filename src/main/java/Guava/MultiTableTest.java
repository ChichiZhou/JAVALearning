package Guava;

import com.google.common.collect.ImmutableTable;

public class MultiTableTest {
    public static void main(String[] args) {
        // https://blog.csdn.net/yaomingyang/article/details/80935483
        ImmutableTable<Integer, Integer, Integer> table = ImmutableTable.<Integer, Integer, Integer>builder()
                .put(1, 2, 2)
                .put(1,3,3)
                .build();

        System.out.println("The rowMap is");
        System.out.println(table.rowMap().values());


    }
}
