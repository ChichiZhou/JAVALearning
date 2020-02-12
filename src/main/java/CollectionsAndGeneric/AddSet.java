package CollectionsAndGeneric;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class AddSet {
    public static void main(String[] args) {
        /**
         * 创建一个Set
         */
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5));

        Set<Integer> set1 = new HashSet<Integer>(){                      // 这种方法感觉有点蠢了
            {
                add(1);
                add(2);
            }
        };
    }
}
