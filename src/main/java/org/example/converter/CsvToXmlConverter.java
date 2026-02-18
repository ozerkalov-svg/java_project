package org.example.converter;

import org.example.models.Record;
import org.example.parser.CsvParser;
import org.example.generator.XmlGenerator;

import java.util.List;

public class CsvToXmlConverter implements Converter {
    @Override
    public void convert(String inputPath, String outputPath) throws Exception {
        CsvParser parser = new CsvParser();
        List<Record> records = parser.parse(inputPath);
        XmlGenerator generator = new XmlGenerator();
        generator.generate(records, outputPath);
    }
}
