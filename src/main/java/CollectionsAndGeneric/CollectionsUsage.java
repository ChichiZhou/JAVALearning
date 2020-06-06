package CollectionsAndGeneric;

import com.google.common.collect.Lists;

import java.util.*;

public class CollectionsUsage {
    public static void main(String[] args) {
        /**
         * 这个类里面有很多方法，某些传入参数是 Collection
         * 传入参数是 Collection， 体现出了 JAVA 的多态
         */

        // 这里使用的 List 是一个 interface，所以不能进行 add 之列的操作
        // List 是 Collection 的子类, Collection 是 interface
        List<String> strings = Arrays.asList("1");
        // 但是如果生成一个 ArrayList，则可以使用
        ArrayList<String> arrayList = Lists.newArrayList(strings);

        Collections.addAll(arrayList, "2");
        System.out.println(arrayList);
        // 验证 copy
        // 如果要使用 copy， 则需要保证两个 List 的长度是一致的
        ArrayList<String> copyArrayList = new ArrayList<>(Arrays.asList("no", "nope"));
        Collections.copy(copyArrayList, arrayList);
        copyArrayList.add("3");
        System.out.println("The src is ");
        System.out.println(arrayList);
        System.out.println("The dest is ");
        System.out.println(copyArrayList);

        // 创建空的 List
        // 类似的还有 emptyMap, emptySet 等
        List<String> emptyList = Collections.emptyList();

        // frequency 得到某个元素出现的次数

        // singleton
        // singleton
        List<String> testSingleton = new ArrayList<>(Arrays.asList("1", "2", "2", "1"));
        Set<String> deleteString = new HashSet<>();
        deleteString.add("2");
        // 如果只用 remove 则只会删除第一个出现的 Object
        testSingleton.remove("1");
        System.out.println(testSingleton);
        // 如果要删除司所有的 Object，则需要用 removeAll 则传入参数是 Collection
        testSingleton.removeAll(deleteString);
        System.out.println("Use the removeAll");
        System.out.println(testSingleton);   // 删除了所有的 2
    }
}
