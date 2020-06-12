package LambdaFunction;

import java.util.*;

public class IteratorProject {
    public static void main(String[] args) {
        Set<String> testSet = new HashSet<>();
        testSet.add("1");
        testSet.add("2");

        Iterator iterator = testSet.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Map<String, String> testMap = new HashMap<>();
        testMap.put("1", "1");
        testMap.put("2", "2");

        Iterator iterator1 = testMap.entrySet().iterator();
        while(iterator1.hasNext()){
            Map.Entry<String, String> mapEntry = (Map.Entry)iterator1.next();
            System.out.println(mapEntry.getKey());
            System.out.println(mapEntry.getValue());
        }
    }

}
