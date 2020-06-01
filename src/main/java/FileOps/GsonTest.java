package FileOps;

import com.google.gson.Gson;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class GsonTest {
    public static void main(String[] args) throws IOException {
        // https://www.jianshu.com/p/eaa72df1f015
        // Gson 用来将 json 转换成对象 object
        // 或者将 object 转换成 json
        Person person = new Person("Shilin", 18, "HEZHO");
        Gson gson = new Gson();
        // 转换成 json，使用了 toJson
        String personString = gson.toJson(person);
        System.out.println(personString);
        // 写入到 file 中的步骤跟 JsonObject 中写入的步骤一致


        // 读取 json 文件，将json文件转换成object
        String readGson = FileUtils.readFileToString(new File("src/main/resources/gsonTest.json"));
        Person readGsonPerson = new Gson().fromJson(readGson, Person.class);
        System.out.println("The person information read from json file is");
        System.out.println(readGsonPerson.toString());
        System.out.println(readGsonPerson.getName());
        System.out.println(readGsonPerson.getAge());
        System.out.println(readGsonPerson.getHusband());
    }

    @Data
    @RequiredArgsConstructor
    public static class Person{
        @NonNull String name;
        @NonNull Integer age;
        @NonNull String husband;
    }
}
