package homework4.file;

import homework4.Car;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PoemsOfPushkin {
    public static void main(String[] args) {
        File file = new File("poem.txt");
        boolean wasCreatedFilePoem = false;
        try {
            wasCreatedFilePoem = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(wasCreatedFilePoem);
        File fileForLetter = new File("letters.txt");
        boolean wasCreatedFileLetter = false;
        try {
            wasCreatedFileLetter = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(wasCreatedFileLetter);
        Map<Character, Integer> map = new HashMap<>();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                for (int i = 0; i < word.length(); i++) {
                    if (!map.containsKey(word.toLowerCase().charAt(i))) {
                        map.put(word.toLowerCase().charAt(i), 0);
                    }
                    map.put(word.toLowerCase().charAt(i), map.get(word.toLowerCase().charAt(i)) + 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileForLetter));
            for (Character p : map.keySet()) {
                bw.write(p + " - " + map.get(p));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}