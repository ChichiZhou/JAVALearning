package TimeAndOutputFormat;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.String.format;

import com.google.common.base.Joiner;
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
         */
        System.out.println(format("Hi, My name is %s, my weight is %d kg", "时琳", 80));
        System.out.println(format("Hi, My age is %d", 30));
        /**
         * 在 format 中换行
         */
        System.out.println(format("Hi, My name is %s \nMy name is %s", "时琳", "周赤"));
        /**
         * 统计一个 list 中某个元素出现的个数
         */
        List<String> integerList = new ArrayList<>(Arrays.asList("1","2","3","4","1","1","1","1","1","2"));
        System.out.println("The frequency for 1 is below");
        System.out.println(Collections.frequency(integerList, 1));
        Set<String> integerSet = new LinkedHashSet<>(integerList);
        integerSet.stream().forEach(key -> Collections.frequency(integerList, key));

        System.out.println(integerSet.stream().collect(Collectors.toMap((a)->a.toString(), a -> Collections.frequency(integerList, a))));

        System.out.println(integerSet);
        System.out.println(integerList);
//        integerList.remove("2");
//        List<String> result = integerSet.stream().collect();
//        System.out.println("If this can remove");
//        System.out.println(integerList);
        System.out.println("Remove all");
        /**
         * 除去只出现一次的数！！！！！！
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
        System.out.println("**********************");
        System.out.println(Joiner.on("").join(string1, string2, string3));
        System.out.println("*******Something interesting*********");
        System.out.println(Joiner.on("").join(string1, set == null ?string2: string3, string3));



    }
}
