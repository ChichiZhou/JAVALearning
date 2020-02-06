package LambdaFunction;

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
         */
        Stream<Integer> stream = Stream.of(1,2,3,4,5);   // 创建 stream
        stream.forEach(a -> System.out.println(a));
        System.out.println("\n************\n");

        Map<String, List<String>> personMap = PersonRepository.getAllPersons()
                .stream().collect(Collectors.toMap(Person::getName, Person::getHobbies)); // 这里就用到了 Stream 的 API
                                                                                        // 这里也是取出 list 中的元素挨个进行操作的
        System.out.println("\n************\n");









    }
}
