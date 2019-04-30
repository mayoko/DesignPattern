package com.deseignpattern.abstractFactory.listfactory;

import com.deseignpattern.abstractFactory.factory.Link;

/**
 * @author mnitta
 */

public class ListLink extends Link {
    public ListLink(final String caption, final String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
