package homework4;

import java.util.HashMap;
import java.util.Map;

public class EnglishText {
    public static void main(String[] args) {
        String[] text = {"text", "Text", "text"};
        Map<String, Integer> countWorldFromText = new HashMap<>();
        for (String world : text) {
            if (!countWorldFromText.containsKey(world)) {
                countWorldFromText.put(world, 0);
            }
            countWorldFromText.put(world, countWorldFromText.get(world) + 1);
        }
        for (String word : countWorldFromText.keySet()) {
            System.out.println(word + " " + countWorldFromText.get(word));
        }
    }
}