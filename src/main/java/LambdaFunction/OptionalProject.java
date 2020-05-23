package LambdaFunction;


import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import lombok.NonNull;

import javax.management.ImmutableDescriptor;

import static java.lang.String.format;

public class OptionalProject {
    public static void main(String[] args) {
        /**
         * Optional 是一个 container
         * 最后会返回的是 Optional<> 这种数据类型而不是原来的数据类型
         *
         * 如果不是 null，则返回 Optional.result (result 是你输入的值)
         * 如果是 null，则返回 Optional.empty
         * 当我们在使用一个 method 的时候，不能直接就使用这个对象来调用 method
         * 而是要先判断一下这个对象是否存在
         *
         *
         * Optional 的常用方法
         * isPresent()：不需要输入值，但是输出值是 boolean
         * ifPresent()：输入值是一个 lambda
         * orElse()：输入一个与前面的 T 相同的类型，然后可以让 Optional 返回这个类型
         */
        String name = "Joe";
        System.out.println(Optional.ofNullable(null));      // 这里返回的是 Optional.empty
        System.out.println(Optional.ofNullable("Joe"));     // 这里返回的是 Optional[Joe]
        System.out.println(Optional.ofNullable(null).toString());
        System.out.println("\n************\n");

        Optional<String> optName = Optional.of(name);     // Optional.of() 里面只能放不是 null 的变量
        System.out.println(optName.get());                // 只有当这个变量不是 null 的时候，才能用 .get()
        System.out.println("\n************\n");

        String address = null;                            // 当可以是 null 的时候，需要用 .ofNullable()
        Optional<String> optAddress = Optional.ofNullable(address);
        System.out.println(optAddress);                   // 当是 null 当时候，会输出一个 Optional.empty
        System.out.println(optAddress.isPresent() ? optName.get() : "No");  // 检查是否存在
        System.out.println("\n************\n");

        System.out.println("The type of Optional object is" + optName.getClass().getName());   // 输出的结果是 Optional
        System.out.println("\n************\n");

        /**
         * 如果没有 .orElse() 那么返回的就是一个 Optional["0"]
         * 但是如果加了 orElse() 那么返回的就是和 value 同一个类型的了
         */
        System.out.println(Optional.ofNullable("0").orElse("Nothing to show"));
        System.out.println(Optional.ofNullable("0"));
        String salary = Optional.ofNullable("0").orElse("Nothing to show");     // orElse 会返回一个和 Optional<T> 中 T 同一个类型的变量
        String salary1 = Optional.ofNullable("0").get();
        System.out.println(salary);
        List<String> testList = new LinkedList<>();
        Optional<String> result = testList.stream().filter(p->p!=null).findFirst();
        System.out.println(format("The result is %s", result.orElse(null)));

        /**
         *
         */
        List<String> resultList = Collections.emptyList();
        System.out.println("The result of ifPresent");
        Optional.of(resultList).ifPresent((element) -> System.out.println(element));
        List<String> resultList2 = Arrays.asList("one", "two");
        System.out.println("Another result of ifPresent");
        /**
         * ifPresent 是根据前面的哪个值来确定是否需要执行其中的 consumer 的
         */
        Optional.of(resultList2).ifPresent((element) -> System.out.println(element));

//        System.out.println(resultList.isEmpty() ? {System.out.println("Empty")} : {System.out.println("No")});
        System.out.println("****");
        System.out.println(Optional.empty().toString());
        System.out.println();

        /**
         * Use Optional for set
         */

        Set<String> testSet = new HashSet<>();
        testSet.add("1");
        Set<Optional>newTestSet = testSet.stream().map(memeber -> Optional.ofNullable(memeber)).collect(Collectors.toSet());

        String country = Joiner.on("_").join(newTestSet);

        System.out.println(country);

        /**
         * Optional.ifPresent()
         */

        Set<String> testMapOptional = new LinkedHashSet<>();
        testMapOptional.add("UNKNOWN");
        String countryTest = Joiner.on("_").join(testMapOptional.stream().filter(p->!p.equals("UNKNOWN")).map(Optional::of).collect(Collectors.toList()));
        System.out.println(format("******** HELLO THERE %s", countryTest));
        System.out.println(countryTest.length());

        List<String> tags = ImmutableList.of();
        Optional<List<String>> tagsList = Optional.ofNullable(tags);

        if(tagsList.isPresent()){
            System.out.println(tagsList.get());
        }

        /**
         * test null
         */
        String prefix = "fff";
        String testNull = prefix == null? "There is null before": prefix + "There is null before";
        System.out.println(testNull);

        /**
         * Test ifPresent()
         */

        List<String> testIfPresentList = new LinkedList<>();
        //Optional<String> testIfPresent = Optional.of("TEST IFPRESENT");
        Optional<String> testIfPresent = Optional.empty();
        testIfPresent.ifPresent(p->testIfPresentList.add(p));

        System.out.println("Test ifPresent()");
        System.out.println(testIfPresentList);


        Optional.empty().map(p->p.toString());

        ImmutableMap<String, String> properites = ImmutableMap.of();
        System.out.println(properites);
        System.out.println(OptionalProject.isEnabled(properites));

        Optional<String> testStream = Optional.of("XBBSB");
        // 无法用 testStream.stream() 所以只能根据 Stream.of() 来生成
        Stream.of(testStream).forEach(p-> System.out.println(p.get()));

        // 使用 flatMap
        // flatMap 的作用是把不在一个维度的变量放到一个维度
        // https://blog.csdn.net/Hatsune_Miku_/article/details/73435618
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Stream.of(data).flatMap(Arrays::stream).forEach(System.out::println);




    }

    public static boolean isEnabled(@NonNull final ImmutableMap<String, String> properites){
        return true;
    }
}
