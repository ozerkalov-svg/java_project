package org.example.converter;

import org.example.models.Record;
import org.example.parser.XmlParser;
import org.example.generator.JsonGenerator;

import java.util.List;

public class XmlToJsonConverter implements Converter {
    @Override
    public void convert(String inputPath, String outputPath) throws Exception {
        XmlParser parser = new XmlParser();
        List<Record> records = parser.parse(inputPath);
        JsonGenerator generator = new JsonGenerator();
        generator.generate(records, outputPath);
    }
}
