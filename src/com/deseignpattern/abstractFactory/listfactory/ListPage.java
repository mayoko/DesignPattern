package com.deseignpattern.abstractFactory.listfactory;

import com.deseignpattern.abstractFactory.factory.Item;
import com.deseignpattern.abstractFactory.factory.Page;

/**
 * @author mnitta
 */

public class ListPage extends Page {
    public ListPage(final String title, final String author) {
        super(title, author);
    }
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html>\n");
        buffer.append("<head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");
        for (final Item item : content) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address>\n");
        buffer.append("</body>\n");
        buffer.append("</html>\n");
        return buffer.toString();
    }
}
