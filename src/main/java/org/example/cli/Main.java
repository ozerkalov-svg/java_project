package org.example.cli;

import org.example.utils.FileFormat;
import org.example.converter.Converter;
import org.example.converter.ConverterFactory;

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Map<String, String> params = parseArgs(args);

        if (!params.containsKey("input") || !params.containsKey("output")) {
            System.out.println("Приклад:");
            System.out.println("java -jar file-converter.jar --input input.json --output output.xml");
            return;
        }

        String input = params.get("input");
        String output = params.get("output");

        FileFormat inputFormat = FileFormat.fromFileName(input);
        FileFormat outputFormat = FileFormat.fromFileName(output);

        Converter converter = ConverterFactory.getConverter(inputFormat, outputFormat);
        try {
            converter.convert(input, output);
            System.out.println("КОнвертація виконана");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static Map<String, String> parseArgs(String[] args) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < args.length - 1; i += 2) {
            if (args[i].startsWith("--")) {
                String key = args[i].substring(2);
                map.put(key, args[i + 1]);
            }
        }
        return map;
    }
}
