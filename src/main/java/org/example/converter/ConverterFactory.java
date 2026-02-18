package org.example.converter;

import org.example.utils.FileFormat;

public class ConverterFactory {

    public static Converter getConverter(FileFormat input, FileFormat output) {
        if (input == output) {
            throw new IllegalArgumentException("Input and output formats are the same");
        }

        switch (input) {
            case JSON:
                switch (output) {
                    case XML: return new JsonToXmlConverter();
                    case CSV: return new JsonToCsvConverter();
                }
                break;
            case XML:
                switch (output) {
                    case JSON: return new XmlToJsonConverter();
                    case CSV: return new XmlToCsvConverter();
                }
                break;
            case CSV:
                switch (output) {
                    case JSON: return new CsvToJsonConverter();
                    case XML: return new CsvToXmlConverter();
                }
                break;
        }
        throw new IllegalArgumentException("Конвертувати не можливоо: " + input + " -> " + output);
    }
}
