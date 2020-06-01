package FileOps;

import com.google.common.base.Charsets;
import com.google.common.io.CharSource;
import com.google.common.io.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * 对于文件的基本操作无非就是 读文件 和 写文件
         */
        String filePath = "src/main/resources/testJavaFile.txt";
        // 创建 File
        File newFile = new File("FileOps", filePath);
        System.out.println(format("Path of new File %s", newFile.getAbsoluteFile()));


        // 读取文件的内容
        StringBuffer stringBuffer = new StringBuffer();
        UseBuffer useBuffer = new UseBuffer();
        useBuffer.createbuffer(filePath, stringBuffer);
        System.out.println(stringBuffer);
        // 如何把文件中的内容重新组合生成一个 String

    }
}
