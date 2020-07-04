package TimeAndOutputFormat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.format;

public class RegexProject {
    public static void main(String[] args) {
        /**
         * https://www.cnblogs.com/hubingxu/archive/2012/02/17/2355516.html
         * 如果是全部匹配，则用 match，使用 Pattern.matches
         *
         * 如果是部分匹配，则用 find
         */

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
        System.out.println("TEST Pattern.matches");
        /**
         * Pattern.matches() 是把需要匹配的 test 当做一个整体来匹配的。并不管里面的 () 是否匹配上了
         */
        System.out.println(format("TEST Pattern matche is %s", Pattern.matches(timeformat, test)));

        if (matcher.find())   // 这里会返回一个 boolean
        {
            System.out.println("true");
            // 下面会调用 group 许多次
            System.out.println("Print the start");
            System.out.println(matcher.group());
            System.out.println("The start for group() is " + matcher.start());
            System.out.println(matcher.group(1));
            System.out.println("The start for group(1) is " + matcher.start());
            System.out.println(matcher.group(2));
            System.out.println("The start for group(2) is " + matcher.start());
            System.out.println(matcher.group(3));
            System.out.println("The start for group(3) is " + matcher.start());
            System.out.println(matcher.group(4));
            System.out.println("The start for group(4) is " + matcher.start());
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

        String filter2 = " - ([A-Z]+[-_A-Z0-9/]*)";
        String filter3 = " - .*";
        String testFilter21 = " - UDP_MAP/G";
        Pattern testMatcherPattern = Pattern.compile(filter2);
        Matcher testMatcherMatcher = testMatcherPattern.matcher(testFilter21);

        System.out.println(format("The result of filter2 is %s", Pattern.matches(filter2, testFilter21)));
        System.out.println(format("The result of testFilter1 is %s", Pattern.matches(filter3, testFilter21)));

        System.out.println(format("first TEST .find() is %s", testMatcherMatcher.find()));
        System.out.println(format("TEST .matches() is %s", testMatcherMatcher.matches()));

        /**
         * 由于 .matches() 会改变 this.last 的值，但是 .find() 需要采用这个 this.last
         * 所以在调用 .matches() 之后再调用 .find() 就会出现错误
         */

        System.out.println(format("second TEST .find() is %s", testMatcherMatcher.find()));

        String testP = "(he).*";
        String inputTest = "hello.sh";
        String inputTest2 = "fuckhello.sh";
        Pattern testPPattern = Pattern.compile(testP);
        Matcher testPMatcher = testPPattern.matcher(inputTest);

        System.out.println("卡成狗");
        System.out.println(testPMatcher.find());
        System.out.println("cnm " + Pattern.matches(testP, inputTest2));


    }
}
