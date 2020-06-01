package FileOps;
import org.apache.commons.io.FileUtils;
import org.json.*;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class JsonObject {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        // https://blog.csdn.net/u014260748/article/details/41521123
        /**
         * 写文件
         */
        // 直接利用 jsonObject 生成一个json 文件
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Shilin");
        jsonObject.put("age", 19);
        List<String> testList = new ArrayList<>();
        testList.add("ShinLin");
        testList.add("HEZHO");
        // 可以直接将 List 放入到 JSONObject 中
        jsonObject.put("husbandAndWife", testList);
        System.out.println("Without indentFactor");
        System.out.println(jsonObject.toString());
        System.out.println("Use indentFactor");
        System.out.println(jsonObject.toString(2));

        // 在 JSONObject 中也可以放 JSONObject
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("school", "CUPB");
        jsonObject.put("degree", jsonObject1);

        // 获得 JSONObjet
        JSONObject jsonObject2 = jsonObject.getJSONObject("degree");
        System.out.println("The JSONObject is");
        System.out.println(jsonObject2);

        // 利用 MapAndFlatMap 生成 JSONArray
        Map<String, String> mapJson = new LinkedHashMap<>();
        mapJson.put("Name", "Shilin");
        mapJson.put("Husband", "HEZHO");

        JSONObject mapJsonTest = new JSONObject(mapJson);
        System.out.println(mapJsonTest.toString());

        // 将 jsonObject 输出到文件中
        String jsonString = jsonObject.toString();
        File jsonFile = new File("src/main/resources/jsonFile.json");
        // 如果存在，则删除
        if(jsonFile.exists()) {
            jsonFile.delete();
        } else {
            // 生成一个 Writer
            // 要想把某些内容写入到 Json 中，必须涉及到
            // Writer, OutputStreamWriter, FileOutputStream
            Writer write = new OutputStreamWriter(new FileOutputStream(jsonFile), "UTF-8");
            write.write(jsonString);
            write.flush();
            write.close();
        }



        /**
         * 读取某个json中的文件
         */
        File readJsonFile = new File("src/main/resources/readJsonFile.json");
        String content = FileUtils.readFileToString(readJsonFile);  // 直接把 file 的内容转变成字符串

        System.out.println("The json content is ");
        System.out.println(content);
        JSONObject readJson = new JSONObject(content);
        System.out.println(readJson.getString("sex"));
        System.out.println(readJson.getString("name"));
        System.out.println(readJson.getInt("age"));

        JSONArray hobbies = readJson.getJSONArray("hobbies");
        System.out.println("The JSONArray is");
        System.out.println(hobbies);

        // 把 hobbies 转成 ArrayList
        List<String> readJsonList = new ArrayList<>();
        for(Object element : hobbies){
            readJsonList.add((String)element);
        }
        System.out.println("The List of JSONArray is");
        System.out.println(readJsonList);

        // 另外一种写法
        List<String> readJsonList2 = new ArrayList<>();
        for(int i = 0; i < hobbies.length(); i++){
            readJsonList2.add(hobbies.getString(i));
        }

        System.out.println("The List of JSONArray2 is");
        System.out.println(readJsonList2);
    }
}
