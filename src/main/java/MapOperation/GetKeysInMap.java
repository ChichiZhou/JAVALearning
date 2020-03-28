package MapOperation;

import static java.lang.String.format;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GetKeysInMap {
    public static void getKeys(Map<String, String> testMap){
        for (String key : testMap.keySet()){
            System.out.println(format("get the key here is %s",key));
            System.out.println(format("get the value of the key is %s",testMap.get(key)));
            System.out.println(format("The first key is %s", testMap.keySet().iterator().next()));
        }
    }




}
