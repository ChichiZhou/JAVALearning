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
        String filePath = "src/main/resources/testJavaFile.txt";
        String filePath2 = "src/main/resources/testCharSource.txt";
//        // 创建 File
//        File newFile = new File("FileOps", filePath);
//        System.out.println(format("Path of new File %s", newFile.getAbsoluteFile()));
        // 向文件中写入内容

        // 读取文件的内容
        StringBuffer stringBuffer = new StringBuffer();
        UseBuffer useBuffer = new UseBuffer();
        useBuffer.createbuffer(filePath, stringBuffer);

        // 如何把文件中的内容重新组合生成一个 String

        // 使用 CharSource
        CharSource charSource = Files.asCharSource(new File(filePath2), Charsets.UTF_8);
        BufferedReader charBufferReader = charSource.openBufferedStream();
        String line = charBufferReader.readLine();
        while (line != null) {
            System.out.println(line);
            line= charBufferReader.readLine();
        }

        // 不适用 Buffer， 直接使用 line
        charSource.lines().forEach(p-> System.out.println(p));
    }
}
