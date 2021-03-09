import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TesztReader {

    public String readAllLines(BufferedReader reader) throws IOException {
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line);
            content.append(System.lineSeparator() ); //xxxxxxxxxxxxxxxxx
        }

        System.out.println(content);
        return content.toString();
    }

    public static void main(String[] args) {
        TesztReader tesztReader = new TesztReader();
        try (BufferedReader reader =
                     new BufferedReader(new FileReader("input.txt"))) {
            tesztReader.readAllLines(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
