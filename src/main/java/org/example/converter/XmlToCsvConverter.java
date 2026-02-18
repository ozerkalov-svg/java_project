package org.example.converter;

import org.example.models.Record;
import org.example.parser.XmlParser;
import org.example.generator.CsvGenerator;

import java.util.List;

public class XmlToCsvConverter implements Converter {
    @Override
    public void convert(String inputPath, String outputPath) throws Exception {
        XmlParser parser = new XmlParser();
        List<Record> records = parser.parse(inputPath);
        CsvGenerator generator = new CsvGenerator();
        generator.generate(records, outputPath);
    }
}
