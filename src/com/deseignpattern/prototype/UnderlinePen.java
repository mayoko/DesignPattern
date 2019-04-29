package com.deseignpattern.prototype;
import com.deseignpattern.prototype.framework.*;

/**
 * @author mnitta
 */

public class UnderlinePen extends Product {
    private final char underLineChar;
    public UnderlinePen(final char underLineChar) {
        this.underLineChar = underLineChar;
    }
    public void use(final String string) {
        final int length = string.getBytes().length;
        System.out.println("\"" + string + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(underLineChar);
        }
        System.out.println();
    }
}
