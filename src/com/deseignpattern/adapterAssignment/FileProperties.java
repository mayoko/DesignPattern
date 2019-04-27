package com.deseignpattern.adapterAssignment;

import java.io.*;
import java.util.Properties;

/**
 * @author mnitta
 */

public class FileProperties implements FileIO {
    private Properties properties;
    FileProperties() {
        properties = new Properties();
    }
    public void readFromFile(final String filename) throws IOException {
        final InputStream inputStream = new FileInputStream(filename);
        properties.load(inputStream);
    }
    public void writeToFile(final String filename) throws IOException {
        final OutputStream outputStream = new FileOutputStream(filename);
        properties.store(outputStream, "written by FilePropeties");
    }
    public void setValue(final String key, String value) {
        properties.setProperty(key, value);
    }
    public String getValue(final String key) {
        return properties.getProperty(key);
    }
}
