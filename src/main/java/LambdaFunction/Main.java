package LambdaFunction;

import static java.lang.String.format;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> con1 = (s) -> {System.out.println(s.toUpperCase());};
        //con1.accept("java8");
        Consumer<String> con2 = (s) -> System.out.println(s.toLowerCase());
        //con2.accept("java8");
        con1.andThen(con2).accept("java8");

        testSwitch("null");
    }

    public static void testSwitch(String a){
        switch (a){
        case "1":
            System.out.println("1");
            break;
        case "null":
            return;
        default:
            throw new IllegalArgumentException("No one wants u");
        }
        System.out.println("alway out?");
    }
}
