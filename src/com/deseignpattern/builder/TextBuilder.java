package com.deseignpattern.builder;

/**
 * @author mnitta
 */

public class TextBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();
    public void makeTitle(final String title) {
        buffer.append("===================================\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }
    public void makeString(final String string) {
        buffer.append("@ " + string + "\n");
        buffer.append("\n");
    }
    public void makeItems(final String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append(" *" + items[i] + "\n");
        }
        buffer.append("\n");
    }
    public void close() {
        buffer.append("===================================\n");
    }
    public String getResult() {
        return buffer.toString();
    }
}
