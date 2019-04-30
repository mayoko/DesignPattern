package com.deseignpattern.abstractFactory.listfactory;

import com.deseignpattern.abstractFactory.factory.Item;
import com.deseignpattern.abstractFactory.factory.Tray;
import com.deseignpattern.iterator.Iterator;

/**
 * @author mnitta
 */

public class ListTray extends Tray {
    public ListTray(final String caption) {
        super(caption);
    }
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        for (final Item item : tray) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
