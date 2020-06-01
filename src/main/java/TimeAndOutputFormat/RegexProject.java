package TimeAndOutputFormat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.format;

public class RegexProject {
    public static void main(String[] args) {
        // 如果仅仅是想验证是否能够匹配字符串，可以直接用 Pattern.matches()
        // 如何想提取匹配的某部分，则需要用 Matcher matcher = pattern.match(test) 然后找 matcher.group()
        String timeformat = "([0-9]{4})-(0?[1-9]|1[012]})-(0?[1-9]|[12][0-9]|3[01])T([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]\\.[0-9]+Z";
        Pattern r = Pattern.compile("([0-9]{4})-(0?[1-9]|1[012]})-(0?[1-9]|[12][0-9]|3[01])T([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");

        if(Pattern.matches(timeformat, "2020-02-18T22:38:14.192Z")){
            System.out.println("true");
        }

        // 这里使用了 matcher
        // matcher 会根据 () 把需要匹配的字符串分成若干个 group
        // 而第一个 group （编号为0）是最外面的那个 group
        // 然后其它的 group 依次排列
        String test = "Operation Time:\n2020-02-18T22:54:41.932Z\n\nSucceeded: 1\nCounts: distinct = 1;deleted 0\n\nCreated: \n1. ROTHWELL1\nDeleted: Null";
        Pattern pattern = Pattern.compile(timeformat);
        Matcher matcher = pattern.matcher(test);

        if (matcher.find())
        {
            System.out.println("true");
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
            System.out.println(matcher.group(4));
            //System.out.println(matcher.group(5));
        }

        String warehouse = "([A-Z]*[0-9]*)/([A-Z]*[0-9]*)/([0-9]{4})-(0?[1-9]|1[0-2])-(0?[1-9]|[12][0-9]|3[01])/.*";

        String testWarehouse = "MPRX5/NT/2020-11-13/jjjjj.json";

        // [] 中括号表示一个字符集
        // () 括号表示一个整体，这个整体会在匹配中体现 https://blog.csdn.net/u010552788/article/details/51019367

        System.out.println(Pattern.matches(warehouse, testWarehouse));

        String filter = "(^OPC$)|(com.hezho)";
        Pattern filterPattern = Pattern.compile(filter);
        String testFilter1 = "com.hezho";
        String testFilter2 = "OPC";

        System.out.println(format("The result of testFilter1 is %s", Pattern.matches(filter, testFilter1)));
        System.out.println(format("The result of testFilter2 is %s", Pattern.matches(filter, testFilter2)));

        String filter2 = " - ([A-Z]+[-_A-Z0-9]*)";
        String filter3 = " - .*";
        String testFilter21 = " - UDP_MAP";

        System.out.println(format("The result of testFilter1 is %s", Pattern.matches(filter2, testFilter21)));
        System.out.println(format("The result of testFilter1 is %s", Pattern.matches(filter3, testFilter21)));
    }
}
