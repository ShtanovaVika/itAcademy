package homework3.collections;

import java.util.Comparator;

public class StudentFirstNameAndLastNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        if (firstStudent.getLastName() == secondStudent.getLastName()) {
             return firstStudent.getFirstName().compareTo(secondStudent.getFirstName());
        }
        return firstStudent.getLastName().compareTo(secondStudent.getLastName());
    }
}