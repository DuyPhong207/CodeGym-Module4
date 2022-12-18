package com.example;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private static Map<String, String> dictionary = new HashMap<String, String>();
    static {
        dictionary.put("Cat", "Con mèo");
        dictionary.put("Dog", "Con chó");
        dictionary.put("Bird", "Con chim");
        dictionary.put("Door", "Cửa");
        dictionary.put("Red", "Màu đỏ");
        dictionary.put("Black", "Màu đen");
        dictionary.put("While", "Màu trắng");
        dictionary.put("Yellow", "Màu vàng");
    }

    public String check(String english) {
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getKey() == english) {
                return entry.getValue();
            }
        }
        return null;
    }
}
