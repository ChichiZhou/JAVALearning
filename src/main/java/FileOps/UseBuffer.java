package FileOps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UseBuffer{
    public void createbuffer(String filePath, StringBuffer stringBuffer) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line= bufferedReader.readLine();
            stringBuffer.append(line);
        }
    }

}
