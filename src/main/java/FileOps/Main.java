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
         *
         * 控制住自己的脆弱的内心，才能不断突破，不断磨砺
         * 序列化分为将 object 序列化 以及将 文本写入 file 中
         * 如果是将 object 序列化，则需要用到 ObjectFileOutputStream 或者 FileOutputStream
         * 如果是将 序列化之后的 object 读取到 File 中，则需要 ObjectFileInputStream 或者 FileInputStream
         * 注意，这里的 output 指的是把 object 输出到 File 中的，
         * 这里的 input 指的是将 File 中被序列化的输出到 object 中
         *
         *
         * 如果是单纯的写入字符串,则使用 FileWriter，但是这里用到了 Buffer。
         * 如果是写入，则用到的是 BufferedWriter
         * 如果是读取，则用到的是 BufferedReader
         *
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
