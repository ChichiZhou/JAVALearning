package CollectionsAndGeneric;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
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

        List<String> newList = new LinkedList<>(Arrays.asList("a"));
        List<String> finalList = new LinkedList<>(Arrays.asList("b"));

        newList = finalList;
        System.out.println(newList);

        List<Integer> testOne = new LinkedList<>();
        List<Integer> testTwo = new LinkedList<>(Arrays.asList(1,2,3,4,5));

        for(Integer element: testTwo){
            testOne.add(addElement(element));
        }

        System.out.println(testOne);

        List<String> testImmutable = ImmutableList.of("1", "2", "3");

        Map<String, String> testEmpty = new LinkedHashMap<>();

        System.out.println(testEmpty);

        /**
         * 分割 List
         */

        List<Integer> testThree = new LinkedList<>(Arrays.asList(1,2,3,4,5));

        List<List<Integer>> newTestThree = Lists.partition(testThree, 2);

//        log.debug("The divide list is {}",newTestThree);
        System.out.println(newTestThree);


    }

    public static Integer addElement(Integer testTwo){

            if(testTwo == 1){
                return null;
            } else {
                return testTwo;
            }

    }




}
