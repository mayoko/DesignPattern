package com.deseignpattern.adapterAssignment;

import java.io.IOException;

/**
 * @author mnitta
 */

public interface FileIO {
    public void readFromFile(final String filename) throws IOException;
    public void writeToFile(final String filename) throws IOException;
    public void setValue(final String key, String value);
    public String getValue(final String key);
}
