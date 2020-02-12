package TimeAndOutputFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        /**
         * 这个是关于JAVA中显示时间和 format 输出的
         */
        System.out.println("The ISO standard time format is below:");
        System.out.println(new SimpleDateFormat("yyyy-MM-dd-HH:mm").format(new Date()));
        /**
         * 以下是关于 format 的使用
         */
        System.out.println(format("Hi, My name is %s, my weight is %d kg", "时琳", 80));
        System.out.println(format("Hi, My age is %d", 30));
    }
}
