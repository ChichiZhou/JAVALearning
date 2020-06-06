package CollectionsAndGeneric;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsUsage {
    public static void main(String[] args) {
        /**
         * Lists 这里就属于 google 的开源了
         *
         */

        String[] a = new String[1];
        List<String> testString = Lists.newArrayList();

        List<String> strings = Arrays.asList("1");
        ArrayList<String> arrayList1 = new ArrayList<>(strings);

    }
}
