package EnumProject;

import static java.lang.String.format;

import java.util.Set;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Day monday = Day.Monday;

        System.out.println("The return for toString is " + monday.toString());
        System.out.println("The return for name is " + monday.name());

        System.out.println("The class info for Day is "+ Day.class);

//        for(Day day: Day.values()){
//            System.out.println(day.name());
//        }

        Stream.of(Day.values()).forEach(p-> System.out.println(p.name()));

    }
}
