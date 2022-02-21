package com.company.homework5;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String str = readFile("D:\\text.txt", StandardCharsets.UTF_8);
        String[] strArr = str.split(" ");
        List<String> al;
        al = Arrays.asList(strArr);
        Collections.sort(al);

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < al.size(); i++){
            if (map.containsKey(al.get(i))) {
                map.put(al.get(i), map.get(al.get(i)) + 1);
            }
            else {
                map.put(al.get(i), 1);
            }
        }

        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }

            System.out.println("word: " + key + ", count: " + value);
        }

        System.out.println("most popular word: " + maxEntry.getKey() + ", count: " + maxEntry.getValue());
    }

    static String readFile(String path, Charset encoding)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}