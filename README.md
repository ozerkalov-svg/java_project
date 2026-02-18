## Запуск програми
Використовувати JAR файл, який збирається через IntelliJ - Maven:

## Приклади запуску
### JSON → XML
Configuration 
org.example.cli.Main
--input src\test\resources\test.json --output target\json-to-xml.xml

java -jar "C:\Users\Admin\IdeaProjects\java_project\target\java_project-1.0-SNAPSHOT-jar-with-dependencies.jar" --input src\test\resources\test.json --output target\json-to-xml.xml

### XML → JSON
Configuration 
org.example.cli.Main
--input src\test\resources\test.xml --output target\xml-to-json.json

java -jar "C:\Users\Admin\IdeaProjects\java_project\target\java_project-1.0-SNAPSHOT-jar-with-dependencies.jar" --input src\test\resources\test.xml --output target\xml-to-json.json

### CSV → XML
Configuration
org.example.cli.Main
--input src\test\resources\test.csv --output target\csv-to-xml.xml

java -jar "C:\Users\Admin\IdeaProjects\java_project\target\java_project-1.0-SNAPSHOT-jar-with-dependencies.jar" --input src\test\resources\test.csv --output target\csv-to-xml.xml