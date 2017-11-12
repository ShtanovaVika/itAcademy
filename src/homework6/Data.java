package homework6;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Data {
    private String activity;
    private String time;
    private LinkedList<String> lesson;

    public Data() {
        lesson = new LinkedList<>();
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean add(String time, boolean thisIsTheEnd) {
        if (thisIsTheEnd) {
            while (!lesson.isEmpty()) {
                lesson.removeFirst();
            }
            return false;
        } else {
            if (timeCheck(time)) {
                if (lesson.isEmpty()) {
                    lesson.addLast(time);
                } else {
                    Pattern pattern = Pattern.compile("(\\d{2}):(\\d{2})");
                    Matcher matTime = pattern.matcher(time);
                    Matcher matLastTime = pattern.matcher(lesson.getLast());
                    while (matTime.find() && matLastTime.find()) {
                        if (matTime.matches() && matLastTime.matches() && (matTime.group(1).compareTo(matLastTime.group(1)) == 1)) {
                            lesson.addLast(time);
                            return true;
                        } else
                            return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean timeCheck(String time) {
        Pattern pattern = Pattern.compile("(\\d{2}):(\\d{2})");
        Matcher mat = pattern.matcher(time);
        String hour = "23";
        String zero = "0";
        String minutes = "59";
        while (mat.find()) {
            if (!mat.matches() || mat.group(1).compareTo(zero) < 0 || mat.group(1).compareTo(hour) > 0 ||
                    mat.group(2).compareTo(zero) < 0 || mat.group(2).compareTo(minutes) > 0) {
                return false;
            }
        }
        return true;
    }
}