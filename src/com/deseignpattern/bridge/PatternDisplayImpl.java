package com.deseignpattern.bridge;

/**
 * @author mnitta
 */

public class PatternDisplayImpl extends DisplayImpl {
    final char head;
    final char center;
    final char tail;
    public PatternDisplayImpl(final char head, final char center, final char tail) {
        this.head = head;
        this.center = center;
        this.tail = tail;
    }
    public void rawOpen() {
        System.out.print(head);
    }
    public void rawClose() {
        System.out.println(tail);
    }
    public void rawPrint() {
        System.out.print(center);
    }
}
