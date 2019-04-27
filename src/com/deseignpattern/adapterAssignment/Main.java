package com.deseignpattern.adapterAssignment;

import java.io.IOException;

/**
 * @author mnitta
 */

public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();
        final String basePath = "./src/com/deseignpattern/adapterAssignment";
        try {
            fileIO.readFromFile(basePath + "/file.txt");
            fileIO.setValue("year", "2004");
            fileIO.setValue("month", "4");
            fileIO.setValue("day", "21");
            fileIO.writeToFile(basePath + "newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
