package MapOperation;

import static java.lang.String.format;

import java.util.*;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;

public class testScript {
    public static void main(String[] args) {
        testScript t = new testScript();
        t.createMap();
        Map<String, String> test = ImmutableMap.of("A", "a");
        System.out.println(test);
        t.JoinTogether(test);

        System.out.println("******************");

        Set<String> testSet = new HashSet<>();
        testSet.add("1");
        testSet.add(null);
        testSet.add(null);
        testSet.add(null);
        testSet.add("2");

        System.out.println(testSet);
    }

    public void createMap(){

        Map<String, String> t = ImmutableMap.of();   // 空的MAP
        Map<String, String> store = new HashMap<>();
        store.put("1", "One");
        store.put("2", "Two");
        GetKeysInMap.getKeys(store);
        Map<String, String> map = new HashMap<>();
        List<String> stringList = Arrays.asList("1", "2", "1");
        for (String key: stringList){
            if (map.containsKey(key)){
                String reuslt = Joiner.on("_").join(store.get(key), map.get(key));
                map.put(key, reuslt);
            }
            else{
                String reuslt = store.get(key);
                map.put(key, reuslt);
            }
        }

//        for (String key: store.keySet()){
//            String finalKey = Joiner.on("_").join();
//        }

//        String finalKey = Joiner.on("_").join(store.keySet());
//        String finalValue = Joiner.on("_").join(store.values());
//
//        System.out.println(format("The joined key is %s", finalKey));
//        System.out.println(format("The joined value is %s", finalValue));

        System.out.println(map);
    }

    public class Warehouse{
        String warehouseId;
        String country;
    }

    public void JoinTogether(Map<String, String> inputMap){
        String finalKey = Joiner.on("_").join(inputMap.keySet());
        String finalValue = Joiner.on("_").join(inputMap.values());

        System.out.println(format("The joined key is %s", finalKey));
        System.out.println(format("The joined value is %s", finalValue));

        Map<String, String> empty = new HashMap<>();
        System.out.println(empty.keySet());
        System.out.println(empty.isEmpty());

        Map<String, Set<String>> testJoinSet = new LinkedHashMap<>();
        String country = "CN";
        Set<String> warehouse = new LinkedHashSet<>();
        warehouse.add("BJ1");
        warehouse.add("BJ2");
        testJoinSet.put(country, warehouse);

        String warehouseResult = Joiner.on("_").join(testJoinSet.get("CN"));

        System.out.println(warehouseResult);
    }
}
