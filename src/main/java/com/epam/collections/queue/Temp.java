package com.epam.collections.queue;

import java.util.Comparator;

public class Temp implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}
