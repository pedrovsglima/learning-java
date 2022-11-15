import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        // READING
        String path = "C:\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // WRITING
        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
        String pathOut = "C:\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut, true))) {
            for (String line:lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();;
        }
    }
}
