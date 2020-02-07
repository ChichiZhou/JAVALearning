package LambdaFunction;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredictProject {
    public static void main(String[] args) {
        Predicate<Integer> lessThan = a -> a >= 50;
        lessThan.test(10);// 返回值是一个 boolean
        System.out.println("\n************\n");

        lessThan.and(lessThan).or(lessThan).negate().test(50);  // 注意这里和 consumer 一样，都只能接受同一个 test 的输入

        System.out.println("\n************\n");
        List<Person> personList = PersonRepository.getAllPersons();
        Predicate<Person> personHeight = (p) -> p.getHeight() >= 100;
        personList.stream().filter(personHeight).collect(Collectors.toList());   // stream 的 filter 是要接受一个 Predicate 的

        System.out.println("\n************\n");

        System.out.println("\n************\n");
        Predicate<String> predicateReturn = (a) -> {return true;};   // 因为 Predicate 是有 return 值的，所以可以写 return 语句
        predicateReturn.test("fdsaf");


    }
}
