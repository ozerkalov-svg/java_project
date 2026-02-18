package org.example.converter;

import org.example.models.Record;
import org.example.parser.CsvParser;
import org.example.generator.JsonGenerator;

import java.util.List;

public class CsvToJsonConverter implements Converter {
    @Override
    public void convert(String inputPath, String outputPath) throws Exception {
        CsvParser parser = new CsvParser();
        List<Record> records = parser.parse(inputPath);
        JsonGenerator generator = new JsonGenerator();
        generator.generate(records, outputPath);
    }
}
