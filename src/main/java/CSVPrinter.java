import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CSVPrinter {
    Reader inLine;
    public CSVPrinter(String fileName) throws FileNotFoundException {
        inLine = new FileReader(fileName);
    }
    public  Iterable<CSVRecord> read() throws IOException {
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(this.inLine);
        return records;
    }

    public static void main(String[] args) throws IOException {
        CSVPrinter csvPrinter = new CSVPrinter("sample.csv");

        ArrayList csvList = new ArrayList<List<String>>();
        for (CSVRecord record : csvPrinter.read()) {
            csvList.add(record.toList());
        }
        System.out.println(csvList);


    }
}
