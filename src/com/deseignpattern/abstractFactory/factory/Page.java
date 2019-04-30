package com.deseignpattern.abstractFactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mnitta
 */

public abstract class Page {
    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<>();
    public Page(final String title, final String author) {
        this.title = title;
        this.author = author;
    }
    public void add(final Item item) {
        content.add(item);
    }
    public void output() {
        try {
            final String filename = title + ".html";
            final Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + "is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public abstract String makeHTML();
}
