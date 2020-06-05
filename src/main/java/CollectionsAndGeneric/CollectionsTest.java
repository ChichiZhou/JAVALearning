package CollectionsAndGeneric;

import com.google.common.collect.ImmutableList;

import java.util.*;

public class CollectionsTest {
    // Collections 是 class
    // Collection 是接口

    public static void main(String[] args) {
        // Collections.frequency

        // Collections.singleton
        // https://www.geeksforgeeks.org/collections-singleton-method-java/
        // It creates a immutable set over a single specified element.
        // An application of this method is to remove an element from Collections like List and Set.

        List<String> testCollectionSingleton = ImmutableList.<String>builder().add("1").add("1").build();
        System.out.println(testCollectionSingleton);

        Set<List<String>> testResult = Collections.singleton(testCollectionSingleton);
        System.out.println(testResult);

        List<String> test = new ArrayList<>();
        test.add("1");
        test.add("1");
        test.add("2");
        test.removeAll(Collections.singleton("1"));
        System.out.println(test);

       List<String> test1 = Arrays.asList("1");
       ArrayList<String> test2 = new ArrayList<>(test1);
       ArrayList<String> test3 = new ArrayList<>(Arrays.asList("1"));
        test3.remove("1");

    }
}
