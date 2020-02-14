package TimeAndOutputFormat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProject {
    public static void main(String[] args) {
        String timeformat = "([0-9]{4})-(0?[1-9]|1[012]})-(0?[1-9]|[12][0-9]|3[01])T([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]\\.[0-9]+Z";
        Pattern r = Pattern.compile("([0-9]{4})-(0?[1-9]|1[012]})-(0?[1-9]|[12][0-9]|3[01])T([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
//        Pattern.matches(r, "Operation Time:2020-02-14-T");
//        if(r.matcher("Operation Time:2020-02-14-T")){};

        if(Pattern.matches("Operation time \n" + timeformat, "Operation Time: \n2020-02-14T18:25:15.656Z\n\nSucceeded: 1 \nCounts: distinct = 1;deleted = 1\n\nCreated:\n1. ROTHWELL1\n\nDeleted:\n1. TEST_TAGSET\n")){
            System.out.println("true");
        } else{
            System.out.println("false");
        }




    }
}
