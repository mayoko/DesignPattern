package com.deseignpattern.builder;

import javax.xml.soap.Text;

/**
 * @author mnitta
 */

public class Main {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        final String result = textBuilder.getResult();
        System.out.println(result);
    }
}
