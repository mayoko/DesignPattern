package com.deseignpattern.abstractFactory.factory;

/**
 * @author mnitta
 */

public abstract class Factory {
    public static Factory getFactory(final String classname) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("Class " + classname + " is not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    public abstract Link createLink(final String caption, final String url);
    public abstract Tray createTray(final String caption);
    public abstract Page createPage(final String title, final String author);
}
