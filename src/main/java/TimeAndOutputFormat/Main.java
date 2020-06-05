package TimeAndOutputFormat;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.lang.String.format;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import sun.awt.image.ImageWatched;

public class Main {
    public static void main(String[] args) {
        /**
         * 这个是关于JAVA中显示时间和 format 输出的
         */
        System.out.println("The ISO standard time format is below:");
        System.out.println(new SimpleDateFormat("yyyy-MM-dd-HH:mm").format(new Date()));
        System.out.println("Use Instant to show the time");
        System.out.println(Instant.now().toString());
        /**
         * 以下是关于 format 的使用
         * 直接调用 format()，这里面有多个参数，使用 % 进行占位，然后在后面补上你需要的参数
         */
        System.out.println(format("Hi, My name is %s, my weight is %d kg", "时琳", 80));
        System.out.println(format("Hi, My age is %d", 30));
        /**
         * 在 format 中换行
         * 可以使用 \n 或者 %n
         */
        System.out.println(format("Hi, My name is %s \nMy name is %s", "时琳", "周赤"));
        System.out.println(format("Hi, My name is %s %nMy name is %s", "时琳", "周赤"));
        /**
         * 利用 java 生成数组
         * http://c.biancheng.net/view/5852.html
         */
        String[] testArray = new String[4]; //不行，一旦为数组的每个数组元素分配了内存空间，每个内存空间里存储的内容就是该数组元素的值，
                                            // 即使这个内存空间存储的内容为空，这个空也是一个值（null）。不管以哪种方式来初始化数组，只要为数组元素分配了内存空间，数组元素就具有了初始值。
                                            //初始值的获得有两种形式，一种由系统自动分配，另一种由程序员指定。
        testArray[0] = "0";
        testArray[1] = "1";
        testArray[2] = "2";
        testArray[3] = "3";

        String[] testArray2 = new String[]{"cnlp", "xbb"};
        System.out.println(Arrays.toString(testArray));
        System.out.println(format("The new method for array is %s", Arrays.toString(testArray2)));
        // 数组是没有 foreach 的，只有 list 有 foreach
        for (String string : testArray2){
            System.out.println(string);
        }


        /**
         * 统计一个 list 中某个元素出现的个数
         * Collections 是一个类；
         * Collection 是一个接口
         */
        List<String> integerList = new ArrayList<>(Arrays.asList("1","2","3","4","1","1","1","1","1","2")); // Arrays.asList 也可以用作
        List<String> stringList = new ArrayList<>(Arrays.asList(testArray2));    // ArrayList 这里就是一个泛型了。但是我还是忘了泛型的东西，需要一会看一看
        System.out.println("The frequency for 1 is below");
        System.out.println(Collections.frequency(integerList, 1));   // 这里必须是继承 Collection 接口的的才能这么做.
        Set<String> integerSet = new LinkedHashSet<>(integerList);
        integerSet.stream().forEach(key -> Collections.frequency(integerList, key));
        // 使用 Collections.frequency 来构建一个 map
        Map<String, Integer> testMap = integerSet.stream().collect(Collectors.toMap(key->key, key -> Collections.frequency(integerList, key)));
        System.out.println("使用 Collections.frequency 构建一个 map");
        System.out.println(testMap);
        // 另外一种写法如下
        System.out.println(integerSet.stream().collect(Collectors.toMap((a)->a.toString(), a -> Collections.frequency(integerList, a))));  // 要想得到一个东西，就必须要使用 stream.collect()

        System.out.println(integerSet);
        System.out.println(integerList);
//        integerList.remove("2");
//        List<String> result = integerSet.stream().collect();
//        System.out.println("If this can remove");
//        System.out.println(integerList);
        System.out.println("Remove all");
        /**
         * 除去只出现一次的数！！！！！！ 这里使用 filter
         */
        System.out.println(integerList.stream().filter(a->Collections.frequency(integerList, a)>1).collect(Collectors.toList()));
        /**
         * Java format 输出
         */
        System.out.println("**********************");
        List<String> integerList2 = new ArrayList<>(Arrays.asList("1","2","3","4","1","1","1","1","1","2"));
        integerList2.forEach(a-> System.out.println(a));
        System.out.println("**********************");
        System.out.println(integerList2.stream().map(a -> format("%d. %s%n", integerList2.indexOf(a), a)).collect(Collectors.joining()));
        System.out.println("**********************");
//        System.out.println(integerList2.stream().map(a -> format("%d. %s%n", integerList2., a)).collect(Collectors.toList()));
        String string1 = "a";
        String string2 = "b";
        String string3 = "c";

        System.out.println(string1.concat(string2).concat(string3));
        System.out.println("**********************");
        Set<String> set = null;
        System.out.println(format("This is %s" + " HELLO WORLD", set == null ? "yes" : "no"));
        System.out.println("****************");
        System.out.println(format("This is %s ".join(set == null ? " HELLO WORLD": "F**K WORLD" + " %s"), set == null ? "yes" : "no"));
        /**
         * 使用 Guava 中的 Joiner 将字符串连接起来
         */
        System.out.println("*******Something interesting*********");
        System.out.println("**********************");
        System.out.println(Joiner.on("").join(string1, string2, string3));
        System.out.println(Joiner.on("").join(string1, set == null ?string2: string3, string3));
        System.out.println(Joiner.on("").join("我爱", "时琳", "一辈子"));

        String testSplit = "IT_DE";
        List<String> splitresult = Splitter.on('_').splitToList("IT");
        List<String> secondSplitResult = Splitter.on('_').splitToList(testSplit);
        System.out.println(splitresult);
        System.out.println(secondSplitResult);

        List<String> s3 = new ArrayList<>();
        List<String> one = Arrays.asList("1");

        System.out.println(format("The result of disjoint is %s", Collections.disjoint(one, s3)));

        Collection<String> testCollection = null;

        System.out.println(testCollection);

        Set<String> testCountry = new LinkedHashSet<>();
        testCountry.add("A");
        String country = Joiner.on("_").join(testCountry.stream().filter(p->!p.equals("A")).collect(Collectors.toList()));

        System.out.println(country);


        Set<String> testSet = new LinkedHashSet<>();
        testSet.add(null);
        System.out.println("If the Set add Null, what will happened?????");
        System.out.println(testSet);
        if(testSet.remove(null) && testSet.isEmpty()){
            System.out.println("empty");
        } else{
            System.out.println("no empty");
        }

    }
}
