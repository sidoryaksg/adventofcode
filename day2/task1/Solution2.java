import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        String file = "D:\\repos\\sidoryak\\adventofcode\\day2\\task1\\input.txt";

    }

    public static List<Integer> readInFile2 (String file){
        List<Integer> list = new ArrayList<>();
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

            while (reader.ready()) {

                list.add(Integer.parseInt(reader.readLine()));
            }

        } catch (IOException e) {
            e.printStackTrace();


        }
        return list;
    }
}
