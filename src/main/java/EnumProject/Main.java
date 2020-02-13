package EnumProject;

import static java.lang.String.format;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Day monday = Day.Monday;

        System.out.println("The return for toString is " + monday.toString());
        System.out.println("The return for name is " + monday.name());

        System.out.println("The class info for Day is "+ Day.class);

        Set<String> set = null;
        System.out.println(format("This is %s" + " HELLO WORLD", set == null ? "yes" : "no"));
        System.out.println("****************");
        System.out.println(format("This is %s ".join(set == null ? " HELLO WORLD": "F**K WORLD" + " %s"), set == null ? "yes" : "no"));
    }
}
