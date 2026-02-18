package org.example.models;

import com.opencsv.bean.CsvBindByName;

public class Record {
    @CsvBindByName(column = "field1")
    private String field1;
    @CsvBindByName(column = "field2")
    private String field2;

    public Record() {}
    public Record(String f1, String f2) { this.field1 = f1; this.field2 = f2; }

    public String getField1() { return field1; }
    public String getField2() { return field2; }

    public void setField1(String field1) { this.field1 = field1; }
    public void setField2(String field2) { this.field2 = field2; }
}
