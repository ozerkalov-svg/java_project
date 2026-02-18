package org.example.converter;

import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void testJsonToXml() throws Exception {
        String input = "src/test/resources/test.json";
        String output = "target/json_to_xml.xml";
        new JsonToXmlConverter().convert(input, output);
        assertTrue(Files.exists(Path.of(output)));
    }

    @Test
    void testXmlToJson() throws Exception {
        String input = "src/test/resources/test.xml";
        String output = "target/xml_to_json.json";
        new XmlToJsonConverter().convert(input, output);
        assertTrue(Files.exists(Path.of(output)));
    }

    @Test
    void testCsvToJson() throws Exception {
        String input = "src/test/resources/test.csv";
        String output = "target/csv_to_json.json";
        new CsvToJsonConverter().convert(input, output);
        assertTrue(Files.exists(Path.of(output)));
    }

    @Test
    void testJsonToCsv() throws Exception {
        String input = "src/test/resources/test.json";
        String output = "target/json_to_csv.csv";
        new JsonToCsvConverter().convert(input, output);
        assertTrue(Files.exists(Path.of(output)));
    }

    @Test
    void testCsvToXml() throws Exception {
        String input = "src/test/resources/test.csv";
        String output = "target/csv_to_xml.xml";
        new CsvToXmlConverter().convert(input, output);
        assertTrue(Files.exists(Path.of(output)));
    }

    @Test
    void testXmlToCsv() throws Exception {
        String input = "src/test/resources/test.xml";
        String output = "target/xml_to_csv.csv";
        new XmlToCsvConverter().convert(input, output);
        assertTrue(Files.exists(Path.of(output)));
    }
}
