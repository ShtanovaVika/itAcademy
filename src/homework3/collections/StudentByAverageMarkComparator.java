package homework3.collections;

import java.util.Comparator;

public class StudentByAverageMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return new Double(first.getAverageMark()).compareTo(second.getAverageMark());
    }
}