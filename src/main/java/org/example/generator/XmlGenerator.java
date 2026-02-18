package org.example.generator;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.models.Record;
import java.io.File;
import java.util.List;

public class XmlGenerator {
    public void generate(List<Record> records, String outputPath) throws Exception {
        XmlMapper mapper = new XmlMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputPath), records);
    }
}
