package LambdaFunction;

import java.util.function.Supplier;

public class SupplierProject {
    public static void main(String[] args) {
        Supplier<String> template = () -> "what are u talking about";

        System.out.println(template.get());
    }
}
