package AdvancedSyntax;

import java.util.Arrays;
import java.util.List;
import com.google.common.collect.ImmutableList;

public class CreateCollections {

    List<Integer> integerList = Arrays.asList(1,2,3,4,5);

    List<String> stringList = ImmutableList.of("1", "2");

    List<String> stringListTwo = ImmutableList.<String>builder().add("1", "2", "3").build(); // Stream, Optional 也有这个 .<>builder()的方法

}
