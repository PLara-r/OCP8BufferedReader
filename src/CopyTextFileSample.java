import java.io.*;
import java.util.*;
public class CopyTextFileSample {
    public static List<String> readFile(File source) throws IOException {
        List<String> data = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String s;
            while((s = reader.readLine()) != null) {
                data.add(s);
            }
        }
        return data;
    }
    public static void writeFile(List<String> data, File destination) throws    IOException {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(destination))) {
            for(String s: data) {
                writer.write(s);
                writer.newLine();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        //Давайте посмотрим на пример программы , которая использует как BufferedReaderи BufferedWriterклассы ,
        // использующие связанные с ним readLine()и write(String)методы.
        // Он читает текстовый файл, выводит каждую строку на экран и записывает копию файла на диск.
        // Поскольку эти классы буферизуются,
        // вы можете ожидать лучшей производительности, чем если бы вы читали / писали каждый символ по одному.
        File source = new File("C:\\Users\\Kosty\\OCP8BufferedReader\\src\\Zoo.csv");
        File destination = new File("C:\\Users\\Kosty\\OCP8BufferedReader\\src\\ZooСору.csv");
        List<String> data = readFile(source);
        for(String record: data) {
            System.out.println(record);
        }
        writeFile(data,destination);
    }}

