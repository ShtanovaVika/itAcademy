package homework6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static final int MAX_DAY = 4;

    public static void main(String[] args) {
        int numberReport;
        Data data = new Data();
        File file = new File("Lesson.txt");
        File fileForFirstReport = new File("FirstReport.txt");
        File fileForSecondReport = new File("SecondReport.txt");
        createFile(file);
        createFile(fileForFirstReport);
        createFile(fileForSecondReport);
        WorkWithFile allLesson = new WorkWithFile(file);
        WorkWithFile firstReport = new WorkWithFile(fileForFirstReport);
        WorkWithFile secondReport = new WorkWithFile(fileForSecondReport);
        while (true) {
            switch (menu()) {
                case 1: {
                    String s = scanner.nextLine();
                    int day = 1;
                    while (day <= MAX_DAY) {
                        boolean thisIsTheEnd = false;
                        boolean flag = false;
                        String time;
                        while (!flag) {
                            System.out.println("День " + day + "\nВведите время: ");
                            time = scanner.nextLine();
                            data.setTime(time);
                            if (!data.add(time, thisIsTheEnd)) {
                                System.out.println("Данные введены не верно");
                            } else {
                                System.out.println("Введите активность: ");
                                String activity = scanner.nextLine();
                                data.setActivity(activity);
                                allLesson.getListLecture(time, activity);
                                if (activity.equals("Конец")) {
                                    thisIsTheEnd = true;
                                    day++;
                                    data.add(time, thisIsTheEnd);
                                    flag = true;
                                }
                            }
                        }
                    }
                }
                case 2: {
                    numberReport = 1;
                    firstReport.workWithReport(file, numberReport);
                }
                break;
                case 3: {
                    numberReport = 2;
                    secondReport.workWithReport(file, numberReport);
                }
                break;
                case 4:
                    return;
                default:
                    System.out.println("Ошибка при вводе!!!");
            }
        }
    }

    private static void createFile(File file) {
        boolean wasCreatedFilePoem = false;
        try {
            wasCreatedFilePoem = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(wasCreatedFilePoem);
    }

    private static int menu() {
        int choice;
        System.out.println("1. Добавить расписание дня");
        System.out.println("2. Посмотреть отчет№1");
        System.out.println("3. Посмотреть отчет№2");
        System.out.println("4. Выход");
        choice = scanner.nextInt();
        return choice;
    }
}