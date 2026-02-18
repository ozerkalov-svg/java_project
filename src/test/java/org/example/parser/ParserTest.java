package org.example.parser;

import org.example.models.Record;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    void testJsonParser() throws Exception {
        JsonParser parser = new JsonParser();
        List<Record> records = parser.parse("src/test/resources/test.json");
        assertEquals(2, records.size());
        assertEquals("A1", records.get(0).getField1());
    }

    @Test
    void testXmlParser() throws Exception {
        XmlParser parser = new XmlParser();
        List<Record> records = parser.parse("src/test/resources/test.xml");
        assertEquals(2, records.size());
        assertEquals("B2", records.get(1).getField2());
    }

    @Test
    void testCsvParser() throws Exception {
        CsvParser parser = new CsvParser();
        List<Record> records = parser.parse("src/test/resources/test.csv");
        assertEquals(2, records.size());
        assertEquals("A2", records.get(1).getField1());
    }
}
