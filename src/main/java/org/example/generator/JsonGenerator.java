package org.example.generator;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.models.Record;
import java.io.File;
import java.util.List;

public class JsonGenerator {
    public void generate(List<Record> records, String outputPath) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputPath), records);
    }
}