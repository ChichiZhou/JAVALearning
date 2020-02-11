package CollectionsAndGeneric;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsInterface {
    public static void main(String[] args) {
        /**
         * 这里注意，Collections 和 Map 都是接口！！！！
         *
         * http://www.51gjie.com/java/639.html
         */
        Collection<Integer> collection = new ArrayList<>();    // Collection 是接口
        for(int i = 0; i < 10; i++){
            collection.add(i);
        }

        collection.forEach(a -> System.out.println(a));
    }
}
