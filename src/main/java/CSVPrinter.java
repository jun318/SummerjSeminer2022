import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CSVPrinter {
    Reader inLine;
    public CSVPrinter(String fileName) throws FileNotFoundException {
        inLine = new FileReader(fileName);
    }
    public  Iterable<CSVRecord> read() throws IOException {
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(this.inLine);
        return records;
    }
}
