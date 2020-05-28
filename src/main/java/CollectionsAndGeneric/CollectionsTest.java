package CollectionsAndGeneric;

import com.google.common.collect.ImmutableList;

import java.util.Collections;
import java.util.List;
import java.util.Set;

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

        Set<List<String>> testResult = Collections.singleton(testCollectionSingleton);

        System.out.println(testResult);
    }
}
