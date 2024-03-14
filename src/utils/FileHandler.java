package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * FileHandler utility class for reading from and writing to text files.
 */
public class FileHandler {

    private final String basePath;

    public FileHandler(String basePath) {
        this.basePath = basePath.endsWith(File.separator) ? basePath : basePath + File.separator;
    }

    /**
     * Reads lines from a text file.
     *
     * @param filename The name of the file to read from.
     * @return A list of strings, each representing a line in the file.
     * @throws IOException If an I/O error occurs.
     */
    public List<String> readFile(String filename) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(basePath + filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    /**
     * Writes lines to a text file, overwriting any existing content.
     *
     * @param filename The name of the file to write to.
     * @param data     The list of strings to write to the file, each string represents a line.
     * @throws IOException If an I/O error occurs.
     */
    public void writeFile(String filename, List<String> data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(basePath + filename, false))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}

