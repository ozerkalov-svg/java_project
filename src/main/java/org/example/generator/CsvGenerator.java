package org.example.generator;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import org.example.models.Record;
import java.io.FileWriter;
import java.util.List;

public class CsvGenerator {
    public void generate(List<Record> records, String outputPath) throws Exception {
        FileWriter writer = new FileWriter(outputPath);
        StatefulBeanToCsv<Record> beanToCsv = new StatefulBeanToCsvBuilder<Record>(writer).build();
        beanToCsv.write(records);
        writer.close();
    }
}
