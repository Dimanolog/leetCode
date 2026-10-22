package lru.v2;

import java.util.*;

public class LRUCache {
    private final Deque<Integer> deque;
    private final Map<Integer, Integer> mapCache;
    private final int capacity;

    public LRUCache(int capacity) {
        this.mapCache = new HashMap<>(capacity, 1.0f);
        this.deque = new ArrayDeque<>(capacity);
        this.capacity = capacity;
    }

    public int get(int key) {
        if (mapCache.containsKey(key)) {
            updateRank(key);

            return mapCache.get(key);
        }

        return -1;
    }

    public void put(int key, int value) {
        if (mapCache.containsKey(key)) {
            updateRank(key);
            this.mapCache.put(key, value);
        } else {
            if (mapCache.size() >= capacity) {
                this.mapCache.remove(deque.removeFirst());
            }

            deque.addLast(key);
            this.mapCache.put(key, value);

        }
    }

    private void updateRank(int key) {
        deque.remove(key);
        deque.addLast(key);
    }
}
