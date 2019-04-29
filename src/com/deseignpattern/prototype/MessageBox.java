package com.deseignpattern.prototype;
import com.deseignpattern.prototype.framework.*;
import sun.plugin2.message.Message;

import java.nio.charset.StandardCharsets;

/**
 * @author mnitta
 */

public class MessageBox extends Product {
    private final char decorateChar;
    public MessageBox(final char decorateChar) {
        this.decorateChar = decorateChar;
    }
    public void use(final String string) {
        final int length = string.getBytes().length;
        printDecorationLine(length);
        System.out.println(decorateChar + " " + string + " " + decorateChar);
        printDecorationLine(length);
    }
    private void printDecorationLine(final int length) {
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decorateChar);
        }
        System.out.println();
    }
}
