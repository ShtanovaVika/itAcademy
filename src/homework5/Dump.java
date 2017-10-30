package homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Dump {

    static final Object LOCK = new Object();
    static final Random RANDOM = new Random();
    static volatile boolean shouldWait = true;
    static Map<String, Integer> dumpList = new HashMap<>();
    private static Map<String, Integer> details2 = new HashMap<>();
    private static Map<String, Integer> details = new HashMap<>();
    static List<String> list = new ArrayList<>(Arrays.asList("Голова", "Тело", "Правая рука",
            "Левая рука", "Правая нога", "Левая нога", "CPU", "RAM", "HDD"));

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int day = 1;
        Scientist firstScientist = new Scientist("Доктор Зло", "Stuart", details);
        Scientist secondScientist = new Scientist("Франкинштейн", "Kevin", details2);
        while (day != 101) {
            System.out.println("Day: " + day);
            if (day == 1)
                firstDay();
            Thread threadFirstScientist = new Thread(firstScientist);
            Thread threadSecondScientist = new Thread(secondScientist);
            Thread threadFactory = new Thread(new Factory());
            threadFactory.start();
            threadFirstScientist.start();
            threadSecondScientist.start();
            try {
                threadFactory.join();
                threadFirstScientist.join();
                threadSecondScientist.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sleeper(threadFactory, threadFirstScientist, threadSecondScientist);
            day++;
        }
        ExecutorService threadPool = Executors.newFixedThreadPool(1);
        Future<Integer> future = threadPool.submit(new MakeRobots(details, details2));
        Integer result = future.get();
        if (result == 1) {
            System.out.println(firstScientist.getNameScientist() + " won !!!");
        } else if (result == 2) {
            System.out.println(secondScientist.getNameScientist() + " won !!!");
        } else if (result == 0) {
            System.out.println("No one has won!!!");
        } else {
            System.out.println("Draw!!!");
        }
        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.HOURS);
    }

    private static void firstDay() {
        for (int i = 0; i < 20; i++) {
            int index = RANDOM.nextInt(9);
            String word = list.get(index);
            if (!dumpList.containsKey(word)) {
                dumpList.put(word, 0);
            }
            dumpList.put(word, dumpList.get(word) + 1);
        }
    }

    private static void sleeper(Thread threadFactory, Thread threadFirstScientist, Thread threadSecondScientist) {
        try {
            threadFactory.sleep(100);
            threadFirstScientist.sleep(100);
            threadSecondScientist.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class MakeRobots implements Callable<Integer> {
        private final Map<String, Integer> details;
        private final Map<String, Integer> details2;

        private MakeRobots(Map<String, Integer> details, Map<String, Integer> details2) {
            this.details = details;
            this.details2 = details2;
        }

        @Override
        public Integer call() throws Exception {
            int first = size(details);
            int second = size(details2);
            if (first == 0 && second == 0)
                return 0;
            else if (first > second)
                return 1;
            else if (first < second)
                return 2;
            else
                return 3;
        }

        private int size(Map<String, Integer> map) {
            if (map.size() == 9) {
                Collection<Integer> mapList = map.values();
                System.out.println("Collected " + Collections.min(mapList) + " robots.");
                return Collections.min(mapList);
            } else return 0;
        }
    }
}