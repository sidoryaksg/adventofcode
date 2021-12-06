import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "D:\\repos\\sidoryak\\adventofcode\\day1\\task1\\in.txt";
        String read;
        List<Integer> list = new ArrayList<>();
        int count = 1;

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

            while (reader.ready()) {

                list.add(Integer.parseInt(reader.readLine()));
            }

            for (int i = 1; i < list.size(); i++) {
                if ((list.get(i)) > (list.get(i-1))) {
                System.out.println(list.get(i));
                count++;

                }
            }

        } catch (IOException e) {
            e.printStackTrace();


        }





        System.out.println(list);
        System.out.println(count);

    }
}
