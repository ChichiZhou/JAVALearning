package TimeAndOutputFormat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.format;

public class RegexProject {
    public static void main(String[] args) {
        String timeformat = "([0-9]{4})-(0?[1-9]|1[012]})-(0?[1-9]|[12][0-9]|3[01])T([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]\\.[0-9]+Z";
        Pattern r = Pattern.compile("([0-9]{4})-(0?[1-9]|1[012]})-(0?[1-9]|[12][0-9]|3[01])T([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");

//        Pattern.matches(r, "Operation Time:2020-02-14-T");
//        if(r.matcher("Operation Time:2020-02-14-T")){};

//        if(Pattern.matches("Operation time \n" + timeformat, "Operation Time: \n2020-02-14T18:25:15.656Z\n\nSucceeded: 1 \nCounts: distinct = 1;deleted = 1\n\nCreated:\n1. ROTHWELL1\n\nDeleted:\n1. TEST_TAGSET\n")){
//            System.out.println("true");
//        } else{
//            System.out.println("false");
//        }


        if(Pattern.matches(timeformat, "2020-02-18T22:38:14.192Z")){
            System.out.println("true");
        }

//        String mydata = "Operation Time:\n2020-02-18T22:38:14.192Z\n\nSucceeded: 1\nCounts: distinct = 1;deleted 1\n\nCreated: \n1. ROTHWELL1\nDeleted: \n1. TEST_TAGSET";
        String test = "Operation Time:\n2020-02-18T22:54:41.932Z\n\nSucceeded: 1\nCounts: distinct = 1;deleted 0\n\nCreated: \n1. ROTHWELL1\nDeleted: Null";
//        Pattern pattern = Pattern.compile("(\\n)(.*)(\\n)");
        Pattern pattern = Pattern.compile(timeformat);
        Matcher matcher = pattern.matcher(test);

        if (matcher.find())
        {
            System.out.println("true");
            System.out.println(matcher.group());
        }

//        String warehouse = "([A-Z]{3}|[A-Z]{4})([0-9]){1}";
//        String warehouse = "([A-Z]*[0-9]*)/([A-Z]*[0-9]*)/([0-9]{4})-(0?[1-9]|1[0-2]})-([0-9][0-9])";
        String warehouse = "([A-Z]*[0-9]*)/([A-Z]*[0-9]*)/([0-9]{4})-(0?[1-9]|1[0-2])-(0?[1-9]|[12][0-9]|3[01])/.*";
        Pattern warehousePattern = Pattern.compile(warehouse);

        String testWarehouse = "MPRX5/NT/2020-11-13/jjjjj.json";

//        Matcher matcher1 = pattern.matcher(testWarehouse);
//
//        System.out.println(matcher1.group());

        // [] 中括号表示一个字符集
        // () 括号表示一个整体，这个整体会在匹配中体现 https://blog.csdn.net/u010552788/article/details/51019367

        System.out.println(Pattern.matches(warehouse, testWarehouse));

        String filter = "(^OPC$)|(com.hezho)";
        Pattern filterPattern = Pattern.compile(filter);
        String testFilter1 = "com.hezho";
        String testFilter2 = "OPC";

        System.out.println(format("The result of testFilter1 is %s", Pattern.matches(filter, testFilter1)));
        System.out.println(format("The result of testFilter2 is %s", Pattern.matches(filter, testFilter2)));

        String filter2 = "( - ([A-Z]+[-_A-Z0-9]*))";
        String testFilter21 = " - UDP_MAP";

        System.out.println(format("The result of testFilter1 is %s", Pattern.matches(filter2, testFilter21)));
    }
}
