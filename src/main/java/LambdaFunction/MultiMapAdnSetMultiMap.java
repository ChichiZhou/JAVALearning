package LambdaFunction;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;

import java.util.List;

public class MultiMapAdnSetMultiMap {
    public static void main(String[] args) {
        ListMultimap<String,String> myMultimap = ArrayListMultimap.create();
        myMultimap.put("Fruit", "Apple");
        myMultimap.put("Fruit", "Banana");
        myMultimap.put("Fruit", "Peach");

        List<String> getFruit = myMultimap.get("Fruit");

        System.out.println(getFruit);

        // 另外一种创建的方法
        ImmutableListMultimap.Builder<String, String> multiMapBuilder = ImmutableListMultimap.builder();
        multiMapBuilder.put("Fruit", "Apple");
        multiMapBuilder.put("Fruit", "Banana");
        multiMapBuilder.put("Fruit", "Peach");

        ImmutableListMultimap testMultiMap = multiMapBuilder.build();
        List<String> testMultiMapFruit = testMultiMap.get("Fruit");

        System.out.println(testMultiMapFruit);


    }
}
