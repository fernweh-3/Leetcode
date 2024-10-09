import java.util.*;

class LRUCache {
    Map<Integer, Integer> map;
    int size;
    List<Integer> recentlyUsed;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        size = capacity;
        recentlyUsed = new ArrayList<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            listRecentlyUsedKey(key);
            return map.get(key);
        } else
            return -1;
    }

    public void put(int key, int value) {
        if (map.size() >= size && !map.containsKey(key)) {
            int listRecentlyUsedKey = listRecentlyUsedKey(key);
            map.remove(listRecentlyUsedKey);
            if (recentlyUsed.size() >= size) {
                recentlyUsed.remove(recentlyUsed.indexOf(listRecentlyUsedKey));
            }
            // mark the key recently used
        } else {
            // mark the key recently used
            listRecentlyUsedKey(key);
        }
        map.put(key, value);
    }

    int listRecentlyUsedKey(int key) {
        // if current key is the least recently used, remove it from the top
        if (recentlyUsed.contains(key)) {
            // if current key is the least recently used, remove it from the top
            recentlyUsed.remove(recentlyUsed.indexOf(key));
        }
        recentlyUsed.add(key);
        return recentlyUsed.get(0);
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */