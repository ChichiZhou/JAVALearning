package LambdaFunction;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProject {
    public static void main(String[] args) {
        /**
         * Stream 只能用作 Collections 或者 Arrays
         * Stream 不会改变原来的数据，只是对这些数据进行某些操作
         * Stream 是专为 lambda 而生的
         *
         * Stream 更像是一个能够迭代的容器。和 iterator 有点像
         * 在这个容器中，可以放入很多 lambda。这些 lambda 可以加到 Stream 这个容器中的每一个元素
         * 还有 Stream 中的一些 API
         *
         * stream 常用的方法
         * map: 输入值是映射（调用目标对象的方法，返回该方法所返回的对象）返回值还是 stream
         * filter： 输入值是 predicate，返回值是 boolean
         * collect：输入值是想要collect到的容器，返回值是这个容器
         * forEach：输入值是一个 consumer，能够对这个容器中的所有对象进行操作!!!!!!!!!
         * ifPresent?
         */
        Stream<Integer> stream = Stream.of(1,2,3,4,5);   // 创建 stream
        stream.forEach(a -> System.out.println(a));
        System.out.println("\n************\n");

        Map<String, List<String>> personMap = PersonRepository.getAllPersons()
                .stream().collect(Collectors.toMap(Person::getName, Person::getHobbies)); // 这里就用到了 Stream 的 API
                                                                                        // 这里也是取出 list 中的元素挨个进行操作的
        System.out.println("\n************\n");

        /**
         * 注意，map 中的第一个参数是这个 stream 的类型
         * 第二个参数是这个类型中的方法
         * 如果要转成别的类型，那么就得在这个类型中写出这个方法
         */
        List<String> fruits = Arrays.asList("Apple", "Orange", "Banana");
        List<Integer> fruitsLength = fruits.stream().map(String :: length).collect(Collectors.toList());  // map 同样也返回一个 stream

        System.out.println(fruitsLength);

        System.out.println("\n************\n");
        Stream.<List<Person>>builder().add(PersonRepository.getAllPersons()).build().forEach(
                per -> System.out.println(per.get(0).getName()));   // 这里说明 stream 中包含的是整个容器的数据类型，而不是容器中的单个元素
                                                                    // Stream 也可以用 builder
        Stream.of(PersonRepository.getAllPersons()).forEach(per -> System.out.println(per.get(0).getName())); // 这么写也是可以的


        List<String> testRemoveIf = new LinkedList<>(Arrays.asList("1","2","3","4","5","6","7"));

        testRemoveIf.removeIf(p-> {return (p.equals("1"));});

        System.out.println(testRemoveIf);











    }
}
