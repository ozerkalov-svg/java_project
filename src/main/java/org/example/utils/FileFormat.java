package org.example.utils;

public enum FileFormat {
    JSON, XML, CSV;

    public static FileFormat fromFileName(String fileName) {
        if (fileName.endsWith(".json")) return JSON;
        if (fileName.endsWith(".xml")) return XML;
        if (fileName.endsWith(".csv")) return CSV;
        throw new IllegalArgumentException("Unsupported file format: " + fileName);
    }
}
