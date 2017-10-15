package homework4.file;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("random.txt");
        int strs[] = new int[8];
        Random random = new Random();
        for (int i = 0; i < strs.length; i++) {
            strs[i] = random.nextInt(10);
            fileWriter.write(strs[i] + "\n");
        }
        fileWriter.close();
        List<String> arrayList = new ArrayList<>();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("random.txt")));
            while ((line = reader.readLine()) != null) {
                arrayList.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(arrayList);
        FileWriter fileWriter1 = new FileWriter("random.txt", true);
        for (String str : arrayList) {
            fileWriter1.write(str);
        }
        fileWriter1.close();
    }
}