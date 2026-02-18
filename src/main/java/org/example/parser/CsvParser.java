package org.example.parser;

import com.opencsv.bean.CsvToBeanBuilder;
import org.example.models.Record;
import java.io.FileReader;
import java.util.List;

public class CsvParser {
    public List<Record> parse(String inputPath) throws Exception {
        return new CsvToBeanBuilder<Record>(new FileReader(inputPath))
                .withType(Record.class)
                .build()
                .parse();
    }
}
