package com.epam.collections.queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.SortedSet;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> res = new PriorityQueue<>(new Temp());
        res.addAll(firstList);
        res.addAll(secondList);
        return res;
    }
}
