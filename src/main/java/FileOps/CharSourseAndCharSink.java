package FileOps;

import com.google.common.base.Charsets;
import com.google.common.io.CharSink;
import com.google.common.io.CharSource;
import com.google.common.io.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class CharSourseAndCharSink {
    public static void main(String[] args) throws IOException {
        String readFilePath = "src/main/resources/testCharSource.txt";
        String writeFilePath = "src/main/resources/testCharSink.txt";
        // 使用 CharSource
        // CharSource 是什么？
        CharSource charSource = Files.asCharSource(new File(readFilePath), Charsets.UTF_8);
        BufferedReader charBufferReader = charSource.openBufferedStream();
        String line = charBufferReader.readLine();
        while (line != null) {
            System.out.println(line);
            line= charBufferReader.readLine();
        }

        // 不使用 Buffer， 直接使用 line
        charSource.lines().forEach(p-> System.out.println(p));

        // 使用 CharSink 将数据写入文件
        // https://geek-docs.com/java/java-tutorial/javaappendtofile.html
        CharSink charSink = Files.asCharSink(new File(writeFilePath), Charsets.UTF_8);
        charSink.write("Hello everyone, I am XiaoFenHong");
    }
}
