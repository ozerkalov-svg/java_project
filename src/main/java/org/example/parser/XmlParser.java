package org.example.parser;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.models.Record;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class XmlParser {
    public List<Record> parse(String inputPath) throws Exception {
        XmlMapper mapper = new XmlMapper();
        return Arrays.asList(mapper.readValue(new File(inputPath), Record[].class));
    }
}
