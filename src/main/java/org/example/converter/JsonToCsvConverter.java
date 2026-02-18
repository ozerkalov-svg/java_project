package org.example.converter;

import org.example.models.Record;
import org.example.parser.JsonParser;
import org.example.generator.CsvGenerator;

import java.util.List;

public class JsonToCsvConverter implements Converter {
    @Override
    public void convert(String inputPath, String outputPath) throws Exception {
        JsonParser parser = new JsonParser();
        List<Record> records = parser.parse(inputPath);
        CsvGenerator generator = new CsvGenerator();
        generator.generate(records, outputPath);
    }
}
