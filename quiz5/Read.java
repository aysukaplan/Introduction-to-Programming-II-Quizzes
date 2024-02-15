import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read {
    public static ArrayList<String> decimalArray = new ArrayList<>();
    public void reading(String fileName) throws IOException {
        String line;
        try (BufferedReader decimals = new BufferedReader(new FileReader(fileName))){
            while ((line = decimals.readLine()) != null) {
                if (!line.endsWith(" ")) {
                    {
                        decimalArray.add(line);
                    }
                } else {
                    while (line.endsWith(" ")) {
                        line = line.substring(0, line.length() - 1);
                    }
                    decimalArray.add(line);
                }
            }
        }
    }
 }
