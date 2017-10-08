package homework3.collections;

import java.util.*;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(
                Arrays.asList(new Student("Ivan", "Shevan", 18, 8.4),
                        new Student("Kate", "Kamzolov", 21, 7.0),
                        new Student("Tony", "Kozlova", 17, 7.8),
                        new Student("Alina", "Koval", 20, 8.1)));
        bestStudent(list);
        System.out.println();
        System.out.println();
        Collections.sort(list, new StudentFirstNameAndLastNameComparator());
        list.forEach(System.out::println);
        System.out.println();
        Collections.sort(list, new StudentByAgeComparator());
        list.forEach(System.out::println);
        System.out.println();
        Collections.sort(list, new StudentByAverageMarkComparator());
        list.forEach(System.out::println);
    }

    public static void bestStudent(List<Student> list) {
        Iterator<Student> iterator = list.iterator();
        Student student = list.get(0);
        while (iterator.hasNext()) {
            if (student.getAverageMark() < iterator.next().getAverageMark()) {
                student = iterator.next();
            }
        }
        System.out.println("Best student " + student);
    }
}