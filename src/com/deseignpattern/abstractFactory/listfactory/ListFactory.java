package com.deseignpattern.abstractFactory.listfactory;

import com.deseignpattern.abstractFactory.factory.Factory;
import com.deseignpattern.abstractFactory.factory.Link;
import com.deseignpattern.abstractFactory.factory.Page;
import com.deseignpattern.abstractFactory.factory.Tray;

/**
 * @author mnitta
 */

public class ListFactory extends Factory {
    public Link createLink(final String caption, final String url) {
        return new ListLink(caption, url);
    }
    public Tray createTray(final String caption) {
        return new ListTray(caption);
    }
    public Page createPage(final String title, final String author) {
        return new ListPage(title, author);
    }
}
