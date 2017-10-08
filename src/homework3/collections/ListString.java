package homework3.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                Arrays.asList("This", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        System.out.println(list);
        markLength4(list);
    }

    private static void markLength4(List<String> list) {
        int a = list.size() + 1;
        for (int i = 0; i <= a; i++) {
            if (list.get(i).length() == 4) {
                list.add(i, "++");
                i++;
            }
        }
        System.out.println(list);
    }
}