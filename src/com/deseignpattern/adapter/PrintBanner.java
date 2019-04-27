package com.deseignpattern.adapter;

/**
 * @author mnitta
 */

public class PrintBanner extends Banner implements Print {
    public PrintBanner(final String string) {
        super(string);
    }
    public void printWeak() {
        showWithParen();
    }
    public void printStrong() {
        showWithAster();
    }
}
