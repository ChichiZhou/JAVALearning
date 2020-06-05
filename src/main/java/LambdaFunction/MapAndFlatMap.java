package LambdaFunction;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {
        List<String> testList = Arrays.asList("1", "2");
        Map<String, List<String>> testMap = new LinkedHashMap<>();

        testMap.put("1", Arrays.asList("one"));
        testMap.put("2", Arrays.asList("two"));
        System.out.println("The testMap is");
        System.out.println(testMap);

        System.out.println("The resultInteger is");
        List<Integer> resultInteger = testList.stream().map(p->Integer.parseInt(p)).collect(Collectors.toList());
        System.out.println(resultInteger);

        // flatMap 就是将Function转化后的Stram合并成一个Stream
        // 所以 flatMap 的返回值一定是一个 stream 才行！！！！

        List<String> resultList = testList.stream().map(p->testMap.get(p)).flatMap(p->p.stream()).collect(Collectors.toList());
        System.out.println(resultList);

        // 合成一个写法
        List<String> resultList2 = testList.stream().flatMap(p->testMap.get(p).stream()).collect(Collectors.toList());
        System.out.println(resultList2);




    }
}
