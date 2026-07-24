package com.cqu.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String str = "ithisjava1isa code\n" +
                "learningjavaforyears\n" +
                "thejavavmrunseverywhere\n" +
                "effectivejava12itemone";
        Pattern p = Pattern.compile("java\\d{0,2}");
        Matcher m = p.matcher(str);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
