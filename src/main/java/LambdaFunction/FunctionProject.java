package LambdaFunction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionProject {
    public static void main(String[] args) {
        /**
         * Consumer 就是干！给啥吃啥但是不吐
         * Predicate 就是看！给啥吃了 但是就告诉你好不好吃
         * Function 就是拉！给啥吃了 但是拉出来不一样的
         *
         * 最重要的一点是，这些 lambda 都是可以嵌套的！！！！！！！
         */
        Function<String, String> function = (a) -> {return a.toUpperCase();}; // 或者写成 (a) -> a.toUpperCaer();
        System.out.println("\n************\n");

        Function<List<Person>, Map<String, Double>> functionPerson = personList -> {
            Map<String, Double> map = new HashMap<String, Double>();
            personList.forEach(per -> map.put(per.getName(), per.getSalary()));
            return map;                     // 这里要有 return
        };

        List<Person> personList = PersonRepository.getAllPersons();
        Map<String, Double> map = functionPerson.apply(personList);       // 这里用 apply 才能调用 function
        System.out.println("\n************\n");

        /**
         * 所有放参数的位置，都可以放变量 或者 集合 或者 别的东西
         */
        BiFunction<String, String, String> biFunction = (a, b) -> (a + " " + b);
        System.out.println("\n************\n");






    }
}
