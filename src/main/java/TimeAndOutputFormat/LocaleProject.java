package TimeAndOutputFormat;

import java.util.Locale;

public class LocaleProject {
    public static void main(String[] args) {
        /**
         * 暂不知道有什么用
         */
        Locale locale1 = new Locale("en", "US", "WIN");

        // print locale
        System.out.println("Locale:" + locale1);

        // print the locale as a string
        System.out.println("Locale:" + locale1.toString());

        // create a new locale
        Locale locale2 = new Locale("fr", "FRANCE", "WIN");

        // print locale
        System.out.println("Locale2:" + locale2);

        // print the locale as a string
        System.out.println("Locale2:" + locale2.toString());
    }
}
