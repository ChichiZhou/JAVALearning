package LambdaFunction;

import java.util.*;

public class IteratorProject {
    public static void main(String[] args) {
        /**
         * https://www.cnblogs.com/hasse/p/5024193.html
         */
        Set<String> testSet = new HashSet<>();
        testSet.add("1");
        testSet.add("2");

        Iterator iterator = testSet.iterator();

        /**
         * iterator.next() 能够返回 Collection 中的下一个值
         */
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 如果是 Maps，则需要用 entrySet() 然后才能用 iterator
        // Stream 中有 iterator 这个方法
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
