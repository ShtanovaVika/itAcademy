package homework3.collections;

import java.util.Comparator;

public class StudentByAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return new Integer(firstStudent.getAge()).compareTo(secondStudent.getAge());
    }
}