package homework5;

import static homework5.Dump.*;

public class Factory implements Runnable {

    @Override
    public void run() {
        synchronized (LOCK) {
            add();
            print();
            shouldWait = false;
            LOCK.notify();
        }
    }

    public void print() {
        dumpList.forEach((key, value) -> System.out.println(key + " Count: " + value + "\n"));
    }

    private void add() {
        int count = RANDOM.nextInt(4)+ 1;
        System.out.println("Factory added " + count);
        for (int i = 0; i < count; i++) {
            int index = RANDOM.nextInt(9);
            String word = list.get(index);
            if (!dumpList.containsKey(word)) {
                dumpList.put(word, 0);
            }
            dumpList.put(word, dumpList.get(word) + 1);
        }
    }
}