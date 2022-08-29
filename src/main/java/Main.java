import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CSVPrinter csvPrinter = new CSVPrinter("sample.csv");

        ArrayList csvList = new ArrayList<List<String>>();
        for (CSVRecord record : csvPrinter.read()) {
            csvList.add(record.toList());
        }
        System.out.println(csvList);
    }
}
