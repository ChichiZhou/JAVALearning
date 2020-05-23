package EnumProject;

import com.google.common.collect.ImmutableList;

import static java.lang.String.format;

import java.util.*;
import java.util.stream.Collectors;
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

        System.out.println(Arrays.stream(Day.values()).iterator().next());

        Day Monday = Day.Monday;
        System.out.println(Monday.getType());

        // 这里有一个使用 collect 的问题
        List<String> testStream = Stream.of(Day.values()).map(p->p.getType()).collect(Collectors.toList());
        System.out.println(testStream);

        System.out.println(Day.Monday.name());


    }
}
