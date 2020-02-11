package CollectionsAndGeneric;

import java.util.*;

public class AddaList {
    /**
     * 有返回值
     * 使用 Arrays.asList()： 输入：一个数组或者一个用逗号分隔的元素列表，输出：一个 List 对象
     *
     * 没有返回值
     * 使用 Collections.addAll()：输入：一个数组或者一个用逗号分隔的元素列表或者一个 Collection 对象， 输出：将元素添加到 Collection
     */
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        collection.addAll(Arrays.asList(3,4,5,6));

        Collections.addAll(collection, 11,12);

        /**
         * 使用 Iterator
         */
        System.out.println("使用 Iterator");
        Iterator<Integer> collectionIterator = collection.iterator();

        while(collectionIterator.hasNext()){
            System.out.println(collectionIterator.next());
        }
    }




}
