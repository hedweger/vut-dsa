package th.dsa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Taylor {
   public static void read(String path) {
    HashMap<String, Integer> count = new HashMap<>();
    try {
        File input = new File(path);
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (count.containsKey(word)) {
                count.put(word, count.get(word) + 1);
            } else {
                count.put(word, 1);
            }
        }
        scanner.close();
        System.out.println(count);
    } catch (FileNotFoundException e) {
        System.err.println(e);
        e.printStackTrace();
    }
   } 
}
