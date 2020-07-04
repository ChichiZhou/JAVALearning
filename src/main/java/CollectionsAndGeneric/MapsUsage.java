package CollectionsAndGeneric;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.util.*;

public class MapsUsage {
    public static void main(String[] args) {
        /**
         * 这些都是 guava 的https://guava.dev/releases/18.0/api/docs/
         *
         */
        Set<String> keySet = new HashSet<>();
        keySet.add("1");
        keySet.add("2");

        // 构造 Map
        Map<String, String> testMap = Maps.asMap(keySet, p->p+"value");
        // 当你想循环 map 中的 key-value pair 的时候，想起楚，只能用 entrySet
        testMap.entrySet().stream().forEach(p-> System.out.println("The key is: " + p.getKey() + "; The value is " + p.getValue()));

        // Maps 可以做到和 new HashMap(); new LinkedHashMap()
        Map<String, String> a0 = Maps.newHashMap();
        Map<String, String> a1 = new HashMap<>();
        // 为什么要加 <> ????
        LinkedHashMap<String, String> b0 = Maps.newLinkedHashMap();
        LinkedHashMap<String, String> b1 = new LinkedHashMap<>();

        // uniqueIndex
        // 注意这里的变量顺序
        Map<String, String> testUnique = Maps.uniqueIndex(keySet, p->p + "Unique");
        testUnique.entrySet().stream().forEach(p-> System.out.println("The key is: " + p.getKey() + "; The value is " + p.getValue()));

        List<String> keyList = ImmutableList.of("1", "1", "2");
        ImmutableMap<String, String> result = Maps.uniqueIndex(keyList.iterator(), p->p);

    }
}
