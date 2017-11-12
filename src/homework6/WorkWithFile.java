package homework6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithFile {

    private File file;
    private Map<String, Integer> mapAllActivity = new LinkedHashMap<>();
    private Map<String, Integer> mapLecture = new LinkedHashMap<>();
    private int allMin;

    public WorkWithFile(File file) {
        this.file = file;
    }

    public void getListLecture(String time, String activity) {
        writeInFile(time + " " + activity + "\n");
        if (activity.equals("Конец")) {
            writeInFile("\n");
        }
    }

    public void workWithReport(File file, int numberReport) {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                String firstString = null;
                if (scanner.hasNext()) {
                    firstString = scanner.next();
                }
                while (scanner.hasNext()) {
                    String nextString = scanner.next();
                    if (numberReport == 1) {
                        getFirstReport(firstString, nextString);
                    } else if (numberReport == 2) {
                        getSecondReport(nextString, firstString);
                    }
                    firstString = nextString;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void getFirstReport(String firstString, String nextString) {
        Pattern pattern = Pattern.compile("(\\d{2}:\\d{2})(\\D*)");
        Matcher matfirst = pattern.matcher(firstString);
        Matcher matsecond = pattern.matcher(nextString);
        if (nextString.equals("")) {
            writeInFile(firstString + "\n\n");
        }
        while (matfirst.find() && matsecond.find()) {
            writeInFile(matfirst.group(1) + " - " + matsecond.group(1) + matfirst.group(2) + "\n");
        }
    }

    private void writeInFile(String text) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(text);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getSecondReport(String nextString, String firstString) {
        if (nextString.equals("")) {
            getPercent(mapAllActivity);
            if (!mapLecture.isEmpty()) {
                writeInFile("Лекции: \n");
                getPercent(mapLecture);
            }
            writeInFile("\n");
            allMin = 0;
            mapAllActivity.clear();
            mapLecture.clear();
        } else {
            int s = getTime(firstString, nextString);
            allMin = allMin + s;
        }
    }

    private int getTime(String firstString, String nextString) {
        Pattern pattern2 = Pattern.compile("(\\d{2}):(\\d{2})\\s(\\D*)");
        int result1 = 0;
        Matcher matfirst1 = pattern2.matcher(firstString);
        Matcher matfirst2 = pattern2.matcher(nextString);
        while (matfirst1.find() && matfirst2.find()) {
            int result2 = 0;
            int hour = Integer.valueOf(matfirst2.group(1)) - Integer.valueOf(matfirst1.group(1));
            int min = Integer.valueOf(matfirst2.group(2)) - Integer.valueOf(matfirst1.group(2));
            result1 = min + hour * 60;
            result2 = min + hour * 60;
            if (matfirst1.group(3).compareTo("Введение") == 0 || matfirst1.group(3).compareTo("Упражнение") == 0 || matfirst1.group(3).compareTo("Перерыв") == 0 || matfirst1.group(3).compareTo("Решение") == 0) {
                addInMap(matfirst1.group(3), result2, mapAllActivity);
            } else {
                addInMap(matfirst1.group(3), result2, mapLecture);
            }
        }
        return result1;
    }

    private void addInMap(String group, int result2, Map<String, Integer> map) {
        for (int i = 0; i <= map.size(); i++) {
            if (!map.containsKey(group)) {
                map.put(group, result2);
            } else {
                map.put(group, map.get(group) + result2);
            }
            result2 = 0;
        }
    }

    private void getPercent(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "\n");
            double percent = entry.getValue() * 100 / allMin;
            writeInFile(entry.getKey() + ": " + entry.getValue() + " мин " + percent + "%\n");
        }
    }
}