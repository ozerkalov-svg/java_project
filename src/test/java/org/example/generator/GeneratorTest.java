package org.example.generator;

import org.example.models.Record;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;

class GeneratorTest {

    List<Record> sampleRecords = List.of(
            new Record("X1", "Y1"),
            new Record("X2", "Y2")
    );

    @Test
    void testJsonGenerator() throws Exception {
        String path = "target/test.json";
        new JsonGenerator().generate(sampleRecords, path);
        assertTrue(Files.exists(Path.of(path)));
    }

    @Test
    void testXmlGenerator() throws Exception {
        String path = "target/test.xml";
        new XmlGenerator().generate(sampleRecords, path);
        assertTrue(Files.exists(Path.of(path)));
    }

    @Test
    void testCsvGenerator() throws Exception {
        String path = "target/test.csv";
        new CsvGenerator().generate(sampleRecords, path);
        assertTrue(Files.exists(Path.of(path)));
    }
}
