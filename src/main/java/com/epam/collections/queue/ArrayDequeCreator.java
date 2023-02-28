package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public static void main(String[] args) {
        ArrayDequeCreator ar = new ArrayDequeCreator();
        Queue<Integer> first = new LinkedList<>(List.of(1, 3, 5, 4, 7, 9));
        Queue<Integer> second = new LinkedList<>(List.of(4, 2, 8, 5, 8, 3));
        System.out.println(first);
        System.out.println(second);
        System.out.println(ar.createArrayDeque(first, second));
    }
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> res = new ArrayDeque<>();
        res.add(Objects.requireNonNull(firstQueue.poll()));
        res.add(Objects.requireNonNull(firstQueue.poll()));
        res.add(Objects.requireNonNull(secondQueue.poll()));
        res.add(Objects.requireNonNull(secondQueue.poll()));
        int counter = 0;
        while(!firstQueue.isEmpty() || !secondQueue.isEmpty()){
            if(counter % 2 == 0){
                secondQueue.add(res.poll());
                res.add(Objects.requireNonNull(secondQueue.poll()));
                res.add(Objects.requireNonNull(secondQueue.poll()));
            } else {
                firstQueue.add(res.poll());
                res.add(Objects.requireNonNull(firstQueue.poll()));
                res.add(Objects.requireNonNull(firstQueue.poll()));
            }
            counter++;
        }
        return res;
    }
}
