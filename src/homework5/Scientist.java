package homework5;

import java.util.Map;
import static homework5.Dump.*;

public class Scientist implements Runnable {

    private Map<String, Integer> details;
    private static final Object LOCK = new Object();
    private String nameScientist;
    private String nameMinion;

    public Scientist(String nameScientist, String nameMinion, Map<String, Integer> details) {
        this.nameScientist = nameScientist;
        this.nameMinion = nameMinion;
        this.details = details;
    }

    public String getNameScientist() {
        return nameScientist;
    }

    private String getNameMinion() {
        return nameMinion;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            while (shouldWait) {
                LOCK.wait();
            }
            sentMinion();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void sentMinion() {
        System.out.println("Minion " + getNameMinion() + " goes to the dump.");
        int count = RANDOM.nextInt(4) + 1;
        System.out.println("Minion " + getNameMinion() + " takes " + count + " details");
        while (!dumpList.isEmpty()) {
            if (count == 0) {
                break;
            }
            int index = RANDOM.nextInt(9);
            String word = list.get(index);
            if (dumpList.get(word) != null) {
                if (!(dumpList.get(word) == 1)) {
                    Integer i = dumpList.get(word) - 1;
                    dumpList.put(String.valueOf(word), i);
                } else dumpList.remove(String.valueOf(word));
                if (!details.containsKey(word)) {
                    details.put(word, 1);
                } else {
                    details.put(word, details.get(word) + 1);
                }
                count--;
            }
        }
    }
}