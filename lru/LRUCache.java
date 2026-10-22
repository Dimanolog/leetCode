package lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    private Map<Integer, Integer> mapCache;

    public LRUCache(int capacity) {
        this.mapCache = new LruLinkedHashMap(capacity);
    }

    public int get(int key) {
        return mapCache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        this.mapCache.put(key, value);
    }

    private static class LruLinkedHashMap extends LinkedHashMap<Integer, Integer> {
        private final int capacity;

        private LruLinkedHashMap(int capacity) {
            super(capacity, 1.0f, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > capacity;
        }
    }
}
