package LambdaFunction;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class CosumerProject {
    public static void main(String[] args) {

        /**
         * accept 里面要写对参数的操作 ！！！！！！！
         */

        Consumer<String> consumer1 = (a) -> System.out.println(a + "Once");

        consumer1.accept("HELLO WORLD");
        consumer1.andThen(consumer1).accept("THIS IS Consumer andThen");  // 这两个 consumer 公用一个 accept
                                                                            // 先前面的 consumer 执行 accept, 再后面的 consumer 执行 accept

        System.out.println("\n************\n");
        Consumer<Person> consumerPerson = (p) -> System.out.println(p.getName());
        consumerPerson.accept(PersonRepository.getPerson());
        System.out.println("\n************\n");
        Consumer<List<Person>> consumerPersonList = (personList) -> personList.forEach(person -> System.out.println(person.getName()));
        consumerPersonList.accept(PersonRepository.getAllPersons());   // Consumer 也可以接受 List，只要前面的泛型声明对了就行
                                                                        // 声明 Consumer 能够接受的类型。这一点很重要
        System.out.println("\n************\n");
        List<Person> personList = PersonRepository.getAllPersons();
        personList.forEach(consumerPerson);                            // 也可以在 forEach 中直接放 consumer. 因为 forEach 接受的参数就是 consumer
                                                                      // 这就是 函数式 编程，将函数当做参数用
        System.out.println("\n************\n");
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x + y);
        biConsumer.accept(1,2);
        System.out.println("\n************\n");
        BiConsumer<String, List<String>> biConsumerList = (name, hobbies) -> System.out.println(name + " " + hobbies); // 要记住，这里可以传进不同类型的参数 ！！！！！！！！！！
        personList.forEach(per -> biConsumerList.accept(per.getName(), per.getHobbies()));   // 虽然 forEach 只能接受一个 Consumer ，但是这里属于 consumer 里面套 consumer !!!!!!!!

    }
}
