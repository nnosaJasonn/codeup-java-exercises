import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fileio {
    public static void main(String[] args) throws IOException {
        String directory = "data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
    try {
        if (Files.notExists(dataFile)) {
            Files.createDirectories(dataDirectory);
        }
    } catch (IOException e){
        e.printStackTrace();
    }

    try {
        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }
    } catch(IOException e){
        e.printStackTrace();
    }

        List<String> groceries = Arrays.asList("coffee", "tea", "cheese");
        Path filepath = Paths.get(directory, filename);
        Files.write(filepath, groceries);


    Files.write (
            Paths.get("data", filename),
            Arrays.asList("eggs"),
            StandardOpenOption.APPEND
            );

        System.out.println("================");

        List<String> lines = Files.readAllLines(Paths.get("data", "info.txt"));
        List<String> newList = new ArrayList<>();

        for(String line: lines){
            if(line.equals("eggs")){
                newList.add("milk");
                continue;
            }
            newList.add(line);
        }

        Files.write(Paths.get("data", "info.txt"), newList);

        Path groceriesPath = Paths.get("data", filename);
        groceries = Files.readAllLines(groceriesPath);
        int i = 0;
        for (String item: groceries) {
            i++;
            System.out.println(i + ". " + item);
        }
    }



}
