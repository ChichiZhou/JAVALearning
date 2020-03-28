package LambdaFunction;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.base.Joiner;

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
        String salary = Optional.ofNullable("0").orElse("Nothing to show");
        System.out.println(salary);

        /**
         *
         */
        List<String> resultList = Collections.emptyList();

        Optional.of(resultList).ifPresent((element) -> System.out.println(element));

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




    }
}
