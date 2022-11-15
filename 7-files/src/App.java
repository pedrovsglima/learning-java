import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        // READING
        String pathRead = "C:\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(pathRead))) {
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

        // LISTING FOLDERS/FILES
        String strPath = "C:\\Users\\pvito\\Downloads\\mestrado";
        File path = new File(strPath);
        
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders:");
        for (File folder:folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files:");
        for (File file:files) {
            System.out.println(file);
        }
    }
}
