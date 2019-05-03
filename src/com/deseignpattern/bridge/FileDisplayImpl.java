package com.deseignpattern.bridge;

import javax.sound.midi.SysexMessage;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author mnitta
 */

public class FileDisplayImpl extends DisplayImpl {
    private final String fileName;
    private List<String> lines;
    FileDisplayImpl(final String fileName) {
        this.fileName = fileName;
    }
    public void rawOpen() {
        try {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    public void rawClose() {}
    public void rawPrint() {
        for (final String string : lines) {
            System.out.println(string);
        }
    }
}
