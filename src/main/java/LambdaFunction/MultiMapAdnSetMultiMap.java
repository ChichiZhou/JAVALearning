package LambdaFunction;

import com.google.common.collect.*;

import java.util.*;

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

        Map<String, Collection<String>> testAsMap = testMultiMap.asMap();

        System.out.println(testAsMap);
        Set<Map.Entry<String,  Collection<String>>> entryList = testAsMap.entrySet();
        System.out.println("The entryList is below");
        entryList.forEach(p-> System.out.println(p.getValue()));

        System.out.println("Another Way");

//        System.out.println(testAsMap.get("Fruit"));


//
//        System.out.println(entryList);


        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        ListMultimap<String,String> myMultimap2 = ArrayListMultimap.create();
        myMultimap.put("Fruit", "Apple");
        myMultimap.put("Fruit", "Banana");
        myMultimap.put("Fruit", "Peach");

        myMultimap2.asMap().entrySet().forEach(p-> System.out.println(p.getValue()));

    }
}
