package com.deseignpattern.abstractFactory;

import com.deseignpattern.abstractFactory.factory.Factory;
import com.deseignpattern.abstractFactory.factory.Link;
import com.deseignpattern.abstractFactory.factory.Page;
import com.deseignpattern.abstractFactory.factory.Tray;

/**
 * @author mnitta
 */

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please add a program argument.");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link asahi = factory.createLink("Asahi Newspaper Company", "http://www.asahi.com/");
        Link yomiuri = factory.createLink("Yomiuri Newspaper Company", "http://www.yomiuri.co.jp/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray trayNews = factory.createTray("Newspaper Company");
        trayNews.add(asahi);
        trayNews.add(yomiuri);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("Search Engine");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "mayoko");
        page.add(trayNews);
        page.add(traySearch);
        // page = factory.createYahooPage();
        page.output();
    }
}
