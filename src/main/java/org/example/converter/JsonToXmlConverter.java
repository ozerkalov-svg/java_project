package org.example.converter;

import org.example.models.Record;
import org.example.parser.JsonParser;
import org.example.generator.XmlGenerator;

import java.util.List;

public class JsonToXmlConverter implements Converter {
    @Override
    public void convert(String inputPath, String outputPath) throws Exception {
        JsonParser parser = new JsonParser();
        List<Record> records = parser.parse(inputPath);
        XmlGenerator generator = new XmlGenerator();
        generator.generate(records, outputPath);
    }
}
