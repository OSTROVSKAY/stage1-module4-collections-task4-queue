package com.epam.collections.queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        PriorityQueue<String> queue = new PriorityQueue<String>(Comparator.reverseOrder());

        queue.addAll(firstList);

        queue.addAll(secondList);

        return queue;

    }
}
