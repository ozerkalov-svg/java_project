package org.example.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.models.Record;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class JsonParser {
    public List<Record> parse(String inputPath) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return Arrays.asList(mapper.readValue(new File(inputPath), Record[].class));
    }
}
