import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "D:\\repos\\sidoryak\\adventofcode\\day1\\task1\\in.txt";
        List<Integer> list = readInFile(file);
        List<Integer> list2 = new ArrayList<>();
        int count = 0;
        int count2 = 0;
        int summ = 0;
        int temp = 0;

        for (int i = 1; i < list.size(); i++) {
            if ((list.get(i)) > (list.get(i-1))) {
                //System.out.println(list.get(i));
                count++;
            }
        }

        for (int i = 0; list.size()-i >2; i++) {
                summ = list.get(i) + list.get(i+1) + list.get(i+2);
                list2.add(summ);
                if (summ > temp) {

                    count2++;
                    temp = summ;
                }
            }


        for (int i = 1; i < list2.size(); i++) {
            if (list2.get(i) <= list2.get(i-1)) {
                list2.remove(i);
            }
        }
        System.out.println(count);

        System.out.println(list2.size());
        System.out.println(count2);
        }


    public static List<Integer> readInFile (String file){
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
